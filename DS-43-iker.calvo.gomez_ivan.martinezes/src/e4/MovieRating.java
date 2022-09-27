package e4;

 enum MovieRating {
     NOT_RATED(0),
    MEDIOCRE (4),
    BAD(2),
    GOOD(6),
    AWFUL(0),
    EXCELLENT(8),
    MASTERPIECE (10);
     private int valor;
     public int getNumericRating() {
         return valor;
     }
     MovieRating(int valor){
         this.valor=valor;
     }
    public boolean isBetterThan(MovieRating movie) {
        if (this == NOT_RATED && movie == AWFUL) {
            return true;
        } else if (movie == NOT_RATED && this == AWFUL) {
            return false;
        } else if (this.getNumericRating() > movie.getNumericRating()) {
            return true;
        } else return false;
    }
}
