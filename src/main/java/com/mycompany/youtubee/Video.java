
package com.mycompany.youtubee;

public class Video {
    public String Titulo;
 public int duracionSegundos;
 public String url;

    public Video(String Titulo, int duracionSegundos, String url) {
        this.Titulo = Titulo;
        this.duracionSegundos = duracionSegundos;
        this.url = url;
    }
    public String getTitulo(){
        return Titulo;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }
    public void setDuracionSegundos(int duracionSegundos)
        {this.duracionSegundos=duracionSegundos;
    
    }
    public String getUrl(String url) {
        return url;
    }
    public void setUrl(String url){
       this.url=url;
}
}
