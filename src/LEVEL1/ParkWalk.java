package LEVEL1;

public class ParkWalk {
    public static void solution(String[] park, String[] routes) {
        String tmp = "";
        int count=0;
        int x=0,y=0;
        int resultX,resultY;
        String[]way=new String[routes.length];
        int[]num=new int[routes.length];
        char[][]arr=new char[park.length][park[0].length()];

       for(int i=0;i< park.length;i++){
           arr[i]=park[i].toCharArray();
           if(park[i].contains("S")){
               y=i;
               x=park[i].indexOf("S");
           }
       }

        for(int i=0;i<routes.length;i++){
            way[i]= String.valueOf(routes[i].charAt(0));
            num[i]=Integer.parseInt(String.valueOf(routes[i].charAt(2)));
        }

        for(int i=0;i<routes.length;i++) {
            resultX = x;
            resultY = y;
            for (int j = 0; j < num[i]; j++) {
                if (way[i].equals("N")) {
                    resultY--;
                } else if (way[i].equals("S")) {
                    resultY++;
                } else if (way[i].equals("W")) {
                    resultX--;
                } else if (way[i].equals("E")) {
                    resultX++;
                }

                if (resultX >= 0 && resultY >= 0 && resultX < park[0].length() && resultY < park.length) {
                    if (arr[resultX][resultY] == 'X')
                        break;
                    else {
                        x = resultX;
                        y = resultY;
                    }
                }
            }
        }
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        String[] park={"SOO","OXX","OOO"};
        String[]routes={"E 2","S 2","W 1"};
        solution(park,routes);
    }
}
