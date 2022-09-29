package e2;

public class SocialDistance {
    public static char [][] seatingPeople ( char [][] layout ){
        char [][] layout2=null;
        boolean end=false;
        int i,j,contador;
        if (layout==null){
            throw new IllegalArgumentException();
        }
        for (i=0;i<layout.length;i++){
            if (layout[0].length!=layout[i].length){
                throw new IllegalArgumentException();
            }
            for (j=0;j<layout[i].length;j++){

                if (layout[i][j]!='A' && layout[i][j]!='#' && layout[i][j]!='.'){
                    throw new IllegalArgumentException();
                }
                if (layout[i][j]=='A'){
                    layout[i][j]='#';
                }
            }
        }
        while (!end){
            if (layout==layout2){
                end=true;
            }
            layout2 = layout;
                for (i=0;i<layout.length;i++) {
                    for (j = 0; j < layout[i].length; j++) {
                        if (layout[i][j] == '#') {
                            contador = 0;
                            if (i == 0 && j == 0) {
                                contador = -1;
                            } else if (i == 0 && j == (layout[i].length) - 1) {
                                contador = -1;
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

                            } else if (i == (layout.length) - 1 && j == 0) {
                                contador = -1;
                            } else if (i == (layout.length) - 1 && j == (layout[i].length) - 1) {
                                contador = -1;
                            } else if (i == (layout.length) - 1) {
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
                            } else if (j == 0) {
                                if (layout[i - 1][j] == '#') {
                                    contador++;
                                }
                                if (layout[i - 1][j + 1] == '#') {
                                    contador++;
                                }
                                if (layout[i][j + 1] == '#') {
                                    contador++;
                                }
                                if (layout[i + 1][j + 1] == '#') {
                                    contador++;
                                }
                                if (layout[i + 1][j] == '#') {
                                    contador++;
                                }
                            } else if (j == (layout[i].length - 1)) {
                                if (layout[i - 1][j] == '#') {
                                    contador++;
                                }
                                if (layout[i - 1][j - 1] == '#') {
                                    contador++;
                                }
                                if (layout[i][j - 1] == '#') {
                                    contador++;
                                }
                                if (layout[i + 1][j - 1] == '#') {
                                    contador++;
                                }
                                if (layout[i + 1][j] == '#') {
                                    contador++;
                                }
                            } else {
                                if (layout[i - 1][j - 1] == '#') {
                                    contador++;
                                }
                                if (layout[i][j - 1] == '#') {
                                    contador++;
                                }
                                if (layout[i + 1][j - 1] == '#') {
                                    contador++;
                                }
                                if (layout[i - 1][j] == '#') {
                                    contador++;
                                }
                                if (layout[i + 1][j] == '#') {
                                    contador++;
                                }
                                if (layout[i - 1][j + 1] == '#') {
                                    contador++;
                                }
                                if (layout[i][j + 1] == '#') {
                                    contador++;
                                }
                                if (layout[i + 1][j + 1] == '#') {
                                    contador++;
                                }
                            }
                            if (contador >= 4) {
                                layout[i][j] = 'A';
                            }
                        }
                    }
                }

                for (i=0;i<layout.length;i++) {
                    for (j = 0; j < layout[i].length; j++) {

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
                        else if (i == 0 && j == (layout[i].length)-1) {
                            if (layout[i][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i+1][j] == '#') {
                                contador++;
                            }
                        }
                        else if (i == 0) {
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
                        else if (i==(layout.length)-1 && j==0) {
                            if (layout[i][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j + 1] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j] == '#') {
                                contador++;
                            }
                        }
                        else if (i==((layout.length)-1) && j==(layout[i].length)-1) {
                            if (layout[i][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j - 1] == '#') {
                                contador++;
                            }
                            if (layout[i-1][j] == '#') {
                                contador++;
                            }
                        }
                        else if (i == (layout.length)-1) {
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
                        }
                        else if (j==0) {
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
                        }
                        else if (j==(layout[i].length-1)) {
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
        for (i=0;i< layout.length;i++){
            System.out.println("[");
            for (j=0;j<layout[i].length;j++){
                System.out.println(layout[i][j]+" ");
            }
            System.out.println("]\n");
        }
    return layout;}
    public static void main(String[] args) {
        char[][] exampleLayout2 = {
                {'A', '.', 'A', 'A', '.'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', '.', 'A', '.', 'A'},
                {'A', 'A', 'A', 'A', '.'},
                {'A', '.', 'A', 'A', '.'}};
        seatingPeople(exampleLayout2);
        char[][] resultLayout2 = {
                {'#', '.', '#', 'A', '.'},
                {'#', 'A', '#', 'A', '#'},
                {'A', '.', '#', '.', '#'},
                {'#', 'A', 'A', 'A', '.'},
                {'#', '.', 'A', '#', '.'}};
    }
}


