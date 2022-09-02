class main{
    public static char[][] make_forward(){
        char[][] pixel = new char[4][13];
        pixel[0][0] = ' ';
        pixel[0][1] = ' ';
        pixel[0][2] = '_';
        pixel[0][3] = '_';
        pixel[0][4] = '_';
        pixel[0][5] = '_';
        pixel[0][6] = '_';
        pixel[0][7] = '_';
        pixel[0][8] = ' ';
        pixel[0][9] = ' ';
        pixel[0][10] = ' ';
        pixel[0][11] = ' ';
        pixel[0][12] = ' ';
        pixel[1][0] = ' ';
        pixel[1][1] = '/';
        pixel[1][2] = '|';
        pixel[1][3] = '_';
        pixel[1][4] = '|';
        pixel[1][5] = '|';
        pixel[1][6] = '_';
        pixel[1][7] = '\\';
        pixel[1][8] = '\'';
        pixel[1][9] = '.';
        pixel[1][10] = '_';
        pixel[1][11] = '_';
        pixel[1][12] = ' ';
        pixel[2][0] = '(';
        pixel[2][1] = ' ';
        pixel[2][2] = ' ';
        pixel[2][3] = ' ';
        pixel[2][4] = '_';
        pixel[2][5] = ' ';
        pixel[2][6] = ' ';
        pixel[2][7] = ' ';
        pixel[2][8] = ' ';
        pixel[2][9] = '_';
        pixel[2][10] = ' ';
        pixel[2][11] = '_';
        pixel[2][12] = '\\';
        pixel[3][0] = '=';
        pixel[3][1] = '\'';
        pixel[3][2] = '-';
        pixel[3][3] = '(';
        pixel[3][4] = '_';
        pixel[3][5] = ')';
        pixel[3][6] = '-';
        pixel[3][7] = '-';
        pixel[3][8] = '(';
        pixel[3][9] = '_';
        pixel[3][10] = ')';
        pixel[3][11] = '-';
        pixel[3][12] = '\'';
        return pixel;
    }
    public static char[][] make_mirror(char[][] orgi_drawing){
        char[][] pixel2 = new char[4][13];
        //Copy original to mirror
        for(int i=0; i<4; i++){
            for(int j =0; j<13; j++){
                pixel2[i][j] = orgi_drawing[i][j];
            }
        }
        for(int i =0; i<4; i++){
            for(int j = 0; j < (pixel2[0].length / 2); j++){
                int ncolum = (pixel2[i].length-1) - j;
                char a = pixel2[i][j];
                char b = pixel2[i][ncolum];
                pixel2[i][j] = b;
                pixel2[i][ncolum] = a;
            }
        }
        // what to change
        for(int i=0; i<4; i++){
            for(int j =0; j<13; j++){
                if(pixel2[i][j] == '\\') {pixel2[i][j] = '/'; continue;}
                if(pixel2[i][j] == '/') {pixel2[i][j] = '\\';continue;}
                if(pixel2[i][j] == '(') {pixel2[i][j] = ')';continue;}
                if(pixel2[i][j] == ')') {pixel2[i][j] = '(';continue;}
            }
        }
        return pixel2;
    }
    public static void main(String[] args) {
        char[][] drawing = new char[4][13];
        drawing = make_forward();

        //Print the first array
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                System.out.print(drawing[i][j]);
            }
            System.out.println("");
        }
        // Print backward
        char[][] backward = new char[4][13];
        backward = make_mirror(drawing);
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                System.out.print(backward[i][j]);
            }
            System.out.println(" ");
        }
        char[][] mirror = new char[4][13];
        mirror = make_mirror(drawing); // calling make_mirror()
        // Mirror
        for(int i = 0; i<mirror.length; i++){
            for(int j = 0; j < 26; j++){
                if(j < 13){
                    System.out.print(drawing[i][j]);
                }
                else{
                    System.out.print(backward[i][j%13]);
                }
            }
            System.out.println();
        }


    }
}
