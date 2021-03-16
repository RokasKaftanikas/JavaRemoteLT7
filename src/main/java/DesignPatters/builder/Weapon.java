package DesignPatters.builder;

public class Weapon {

    private final String type;
    private final Integer size;
    private final Integer calibre;

    //constructor needs to be PRIVATE
    private Weapon(String type, Integer size, Integer calibre) {
        this.type = type;
        this.size = size;
        this.calibre = calibre;
    }

    public String getType() {
        return type;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getCalibre() {
        return calibre;
    }

    // statine klase vidine
    public static class Builder {

        private String type;
        private Integer size;
        private Integer calibre;

        //privalomi parametrai
        public Builder(Integer calibre){
            this.calibre = calibre;
        }

        public Builder withType(String type){
            this.type = type;
            return this;
        }

        public Builder withSize (Integer size){
            this.size = size;
            return this;
        }

        public Weapon build(){
            return new Weapon(type, size, calibre);
        }

    }
}
