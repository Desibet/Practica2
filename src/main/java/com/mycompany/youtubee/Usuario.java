
package com.mycompany.youtubee;


public class Usuario {
    public String  nombre;
   public Video videosubido;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Video getVideosubido() {
        return videosubido;
    }

    public void subirVideo(Video videosubido) {
        this.videosubido = videosubido;
    }
   
    public void mostrarInfoUsuario(){
        System.out.println("Usuario: "+nombre);
        if(videosubido !=null){
      System.out.println("Ultimo video Subido:"+videosubido.getTitulo());
    } 
    else{
        System.out.println("aun no se ha subido videos");
}
}}
