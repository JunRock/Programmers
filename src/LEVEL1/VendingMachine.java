package LEVEL1;
public class VendingMachine {
    static public void solution(String[] keymap, String[] targets) {
        int[] answer=new int[targets.length];

        for(int i=0;i<targets.length;i++){
            for(int j=0;j<targets[i].length();j++){
                int max=101;
                for(int k=0;k<keymap.length;k++){
                    int index=keymap[k].indexOf(targets[i].charAt(j));
                    if (index != -1) {
                        if(max>index)
                            max=index;
                    }
                }
                if(max!=101){
                    answer[i]+=max+1;
                }
                else{
                    answer[i]=-1;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] keymap={"AGB","BSSS"};
        String[] targets={"AGZ","BSSS"};
        solution(keymap,targets);
    }
}
