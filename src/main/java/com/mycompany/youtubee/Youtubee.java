

package com.mycompany.youtubee;


public class Youtubee {

    public static void main(String[] args) {
       Usuario usuario= new Usuario("Juan Iran GP");
       Video video= new Video ("Aprendiendo Java pt.2",1705,"https;//yotube");
       usuario.subirVideo(video);
       usuario.mostrarInfoUsuario();
       
       Usuario usuario2=new Usuario("anota a quien quieras");
       Comentario comment1=new Comentario("anota algo que quieras ",usuario2);
       System.out.println("El usuario "+ usuario2.getNombre()+"Publico el comentario "+ comment1.getContenido());
       

    }
}
