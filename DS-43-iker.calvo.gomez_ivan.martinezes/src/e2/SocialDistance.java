package e2;

public class SocialDistance {
    public static char [][] seatingPeople ( char [][] layout ){
        boolean end=false;
        int i,j,contador;
        for (i=0;i<layout.length;i++){
            for (j=0;j<layout[i].length;j++){
               if (layout[i][j]=='A'){layout[i][j]='#';}
            }
        }
        while (!end){
            for (i=0;i<layout.length;i++){
                for (j=0;j<layout[i].length;j++){
                    if (layout[i][j]=='#') {
                        contador = 0;
                        if (i == 0 && j == 0) {
                            contador = 0;
                        } else if (i == 0) {
                            if (layout[i][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i][j + 1] == '#') {
                                contador++;
                            }

                        }
                    }
                }
            }

        }
    }
}
