class Solution {

    class DSU {
        int[] parent;

        DSU(int n){
            parent = new int[n];
            for(int i=0;i<n;i++) parent[i]=i;
        }

        int find(int x){
            if(parent[x]!=x)
                parent[x]=find(parent[x]);
            return parent[x];
        }

        boolean union(int a,int b){
            int pa=find(a);
            int pb=find(b);

            if(pa==pb) return false;

            parent[pa]=pb;
            return true;
        }
    }

    public int maxStability(int n, int[][] edges, int k) {

        int left = 0;
        int right = 200000;
        int ans = -1;

        while(left<=right){

            int mid = left + (right-left)/2;

            if(canBuild(n,edges,k,mid)){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return ans;
    }

    private boolean canBuild(int n,int[][] edges,int k,int target){

        DSU dsu = new DSU(n);

        int used = 0;
        int upgrades = 0;

        List<int[]> optional = new ArrayList<>();

        // include must edges
        for(int[] e:edges){

            int u=e[0];
            int v=e[1];
            int w=e[2];
            int must=e[3];

            if(must==1){

                if(w < target)
                    return false;

                if(!dsu.union(u,v))
                    return false;

                used++;
            }
            else{
                optional.add(e);
            }
        }

        // SORT optional edges by max possible strength
        optional.sort((a,b)->{
            int A = Math.max(a[2],2*a[2]);
            int B = Math.max(b[2],2*b[2]);
            return B-A;
        });

        for(int[] e:optional){

            int u=e[0];
            int v=e[1];
            int w=e[2];

            if(dsu.find(u)==dsu.find(v))
                continue;

            if(w >= target){
                dsu.union(u,v);
                used++;
            }
            else if(2*w >= target && upgrades < k){
                dsu.union(u,v);
                upgrades++;
                used++;
            }

            if(used==n-1)
                return true;
        }

        return used==n-1;
    }
}