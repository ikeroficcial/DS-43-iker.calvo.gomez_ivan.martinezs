package e2;

public class SocialDistance {
    public static char [][] seatingPeople ( char [][] layout ){
        char [][] layout2=null;
        boolean end=false;
        int i,j,contador;
        for (i=0;i<layout.length;i++){
            for (j=0;j<layout[i].length;j++){
               if (layout[i][j]=='A'){layout[i][j]='#';}
            }
        }
        while (!end){
            if (layout==layout2){end=true;}
            for (i=0;i<layout.length;i++){
                for (j=0;j<layout[i].length;j++){
                    layout2=layout;
                    if (layout[i][j]=='#') {
                        contador = 0;
                        if (i == 0 && j == 0) {
                            contador = -1;
                        }
                        else if (i == 0 && j == (layout[i].length)-1) {
                            contador = -1;
                        }else if (i == 0) {
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

                        } else if (i==(layout.length)-1 && j==0) {
                            contador=-1;
                        } else if (i==(layout.length)-1 && j==(layout[i].length)-1) {
                        contador=-1;
                    }else if (i == (layout.length)-1) {
                            if (layout[i][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i][j + 1] == '#') {
                                contador++;
                            }
                        } else if (j==0) {
                            if (layout[i-1][j] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i ][j+1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j] == '#') {
                                contador++;
                            }
                        } else if (j==(layout[i].length-1)) {
                            if (layout[i-1][j] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i][j-1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j] == '#') {
                                contador++;
                            }
                        }
                        else {
                            if (layout[i-1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j-1] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j +1] == '#') {
                                contador++;
                            }
                            if (layout[i][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j+1] == '#') {
                                contador++;
                            }
                        }
                        if (contador>=4){
                            layout[i][j]='A';
                        }
                    }
                    if (layout[i][j]=='A') {
                        contador = 0;
                        if (i == 0 && j == 0) {
                            if (layout[i][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j] == '#') {
                                contador++;
                            }
                        }
                        if (i == 0 && j == (layout[i].length)-1) {
                            if (layout[i][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j] == '#') {
                                contador++;
                            }
                        }else if (i == 0) {
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

                        } else if (i==(layout.length)-1 && j==0) {
                            if (layout[i][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j] == '#') {
                                contador++;
                            }
                        } else if (i==(layout.length)-1 && j==(layout[i].length)-1) {
                            if (layout[i][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j] == '#') {
                                contador++;
                            }
                        }else if (i == (layout.length)-1) {
                            if (layout[i][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i][j + 1] == '#') {
                                contador++;
                            }
                        } else if (j==0) {
                            if (layout[i-1][j] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i ][j+1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j] == '#') {
                                contador++;
                            }
                        } else if (j==(layout[i].length-1)) {
                            if (layout[i-1][j] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i][j-1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j] == '#') {
                                contador++;
                            }
                        }
                        else {
                            if (layout[i-1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j-1] == '#') {
                                contador++;
                            }
                            if (layout[i - 1][j] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j +1] == '#') {
                                contador++;
                            }
                            if (layout[i][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i + 1][j+1] == '#') {
                                contador++;
                            }
                        }
                        if (contador<1){
                            layout[i][j]='#';
                        }
                    }

                }
            }

        }
    return layout;}
}
