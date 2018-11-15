
import javax.swing.JOptionPane;
import java.io.*;
import javax.sound.sampled.*;

public class sub {
   public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
   int tmar=0;   
   int submarino=0;
   int selx=0;
   int sely=0;
   Clip sonar = AudioSystem.getClip();// Se obtiene un Clip de sonido
   sonar.open(AudioSystem.getAudioInputStream(new File("src/sonar.wav")));// Se carga con un fichero wav
   sonar.loop(700);//play    
      
  JOptionPane.showMessageDialog(null,"Bienvenido a la estacion naval un rinconcito del cielo\nCabo a sido seleccionado para una importante mision\nSabemos que ha conseguido las dimensiones del mar enemigo\nDiríjase con el sargento Aquiles Bailoyo, el le ayudar con la mision.\n suerte ");    
externo:
while (true){
    
while(true){
    

    try{
           tmar=Integer.parseInt(JOptionPane.showInputDialog("Sargento aquiles Bailoyo:Hasta que logro conocerte me han dicho que eres un cabo muy inteligente\nno me extaña que te hallan seleccionado para esta mision\nDame las dimensiones que tiene el perimetro del mar enemigo: "));

    
  if(tmar>=5&&tmar<=100){break externo;}
    
  Clip error = AudioSystem.getClip();// Se obtiene un Clip de sonido
    error.open(AudioSystem.getAudioInputStream(new File("src/error.wav")));// Se carga con un fichero wav
    error.start();//play
  JOptionPane.showMessageDialog(null,"Estas bromenado verdad sabes que las dimensiones son mayores a 5 y menores a 100\nvuelve a cargar los datos en la bandeja. Es una orden. ");    
  
}
catch (NumberFormatException  abcde) {//El bloque catch indica el error que captura.
    
  Clip error = AudioSystem.getClip();// Se obtiene un Clip de sonido
    error.open(AudioSystem.getAudioInputStream(new File("src/error.wav")));// Se carga con un fichero wav
    error.start();//play

    
JOptionPane.showMessageDialog(null,"Empiezo a dudar de esa inteligencia.\nDame esas coordenadas es una orden","error",JOptionPane.WARNING_MESSAGE);}
}			

}
  boolean mar[][]=new boolean[tmar][tmar];
  String tablero="";
  int misiles=(((tmar*tmar)*15)/100);
  

  while(submarino<(((tmar*tmar)*10)/100)){
      
 
      int tempx=(int)(Math.random()*((tmar-1)-0));
      int tempy=(int)(Math.random()*((tmar-1)-0));
      if(mar[tempx][tempy]==false){
        mar[tempx][tempy]=true;    
        submarino++;
      }
  }
  
 /* 
  for(int x=0;x<tmar;x++){
        for(int y=0;y<tmar;y++){
        tablero=tablero+mar[x][y]+" ";
        }
        tablero=tablero+"\n";
      }
  JOptionPane.showMessageDialog(null,tablero);
  */
  
    JOptionPane.showMessageDialog(null,"Hemos marcado los coordenas que nos haz proporcionado y hemos encontrado "+submarino+" submarinos\npor suerte tenemos una dotacion de "+misiles+" Misiles");
 while(submarino>0&&misiles>0){
    A:         
  while(true){ 
  
      
    Clip carga = AudioSystem.getClip();// Se obtiene un Clip de sonido
    carga.open(AudioSystem.getAudioInputStream(new File("src/carga.wav")));// Se carga con un fichero wav
    carga.start();//play   
    
   sely=Integer.parseInt(JOptionPane.showInputDialog(null,"Usa tu inteligencia, sabes que no tenemos muchos misiles\nSubmarinos: "+submarino+"\nMisiles: "+misiles+"\n¿Cual es la coordenada en  X?")); 
    Clip cargay = AudioSystem.getClip();// Se obtiene un Clip de sonido
    cargay.open(AudioSystem.getAudioInputStream(new File("src/carga.wav")));// Se carga con un fichero wav
    cargay.start();//play
   selx=Integer.parseInt(JOptionPane.showInputDialog(null,"Usa tu inteligencia, sabes que no tenemos muchos misiles\nSubmarinos: "+submarino+"\nMisiles: "+misiles+"\n¿Cual es la coordenada en  Y?"));
   if((selx>=0&&selx<=tmar-1)&&(sely>=0&&sely<=tmar-1)){break A;}
   
   else {

    Clip error = AudioSystem.getClip();// Se obtiene un Clip de sonido
    error.open(AudioSystem.getAudioInputStream(new File("src/error.wav")));// Se carga con un fichero wav
    error.start();//play
     JOptionPane.showMessageDialog(null,"La coordenada ["+sely+","+selx+"] esta fuera del perimetro\nNo podemos desperdiciar misiles ");
  
   }
   
      
      
    
   }
  
  
  if(mar[selx][sely]==true){
      
      
     Clip Fail = AudioSystem.getClip();// Se obtiene un Clip de sonido
     Fail.open(AudioSystem.getAudioInputStream(new File("src/explo.wav")));// Se carga con un fichero wav
     Fail.start();//play       
     JOptionPane.showMessageDialog(null," HAA le hemos dado. Eres fabuloso en esto ");
    mar[selx][sely]=false;  
    submarino--;
  }
  else{  
      
      
      Clip Fail = AudioSystem.getClip();// Se obtiene un Clip de sonido
      Fail.open(AudioSystem.getAudioInputStream(new File("src/fail.wav")));// Se carga con un fichero wav
      Fail.start();//play
      if(misiles==2){
      Clip alerta = AudioSystem.getClip();// Se obtiene un Clip de sonido
      alerta.open(AudioSystem.getAudioInputStream(new File("src/alerta.wav")));// Se carga con un fichero wav
      alerta.start();//play
      }
      JOptionPane.showMessageDialog(null,"Demonio, entiende que no podemos desperdiciar municion ");
      
}
  misiles--;
  
  if ((misiles==0)&&(submarino==0)){
    Clip a = AudioSystem.getClip();// Se obtiene un Clip de sonido
    a.open(AudioSystem.getAudioInputStream(new File("src/win.wav")));// Se carga con un fichero wav
    a.start();//play 
  JOptionPane.showMessageDialog(null,"Si , hemos ganado la guerra haz acabado con todo incluyendo lo misiles \nResultado final:\nSubmarinos restantes: "+submarino+"\nMisiles restantes: "+misiles);
  }
  if ((misiles>0)&&(submarino==0)){
    Clip b = AudioSystem.getClip();// Se obtiene un Clip de sonido
    b.open(AudioSystem.getAudioInputStream(new File("src/win1.wav")));// Se carga con un fichero wav
    b.start();//play     
  JOptionPane.showMessageDialog(null,"Claro que si, hemos gando la guerra nunca dude de ti y hasta has ahorrado misiles \nResultado final:\nSubmarinos restantes: "+submarino+"\nMisiles restantes: "+misiles);
  }
  if ((misiles==0)&&(submarino>0)){
 Clip c = AudioSystem.getClip();// Se obtiene un Clip de sonido
 c.open(AudioSystem.getAudioInputStream(new File("src/lose.wav")));// Se carga con un fichero wav
 c.start();//play     
  JOptionPane.showMessageDialog(null,"No sirves para esto eres una deshora para el ejercito\nResultado final:\nSubmarinos restantes: "+submarino+"\nMisiles restantes: "+misiles);
  }
  
  
  
  
  
  
  
 }
  
  
  
  
  }
}  

  