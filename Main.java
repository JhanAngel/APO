public class Main {
    

          int Elementos=17; 
           int[] arreglo= {76,10,8,26,1,34,66,55,23,223,102,342,11,48,99,71,13}; 
                    int[] aux=new int[arreglo.length];
            
            // metodo Mergesort
            for(int tam=1;tam<arreglo.length;tam*= 2){
              for(int i=0;i<arreglo.length-tam;i+=2*tam){
                    int medio=i+tam-1;
                    int fin=Math.min(i+2*tam-1,arreglo.length-1);
    
                    for(int k=i;k<=fin;k++){
                       aux[k]=arreglo[k];
                    }
                    int izq=i;
                    int der=medio+1;
                    int k=i;
    
                    // se mezclan los dos segmentos ya ordenados
                    while(izq <=medio&&der<=fin){
                        if(aux[izq]<=aux[der]){
                           arreglo[k++]=aux[izq++];
                        }else{
                           arreglo[k++]= aux[der++];
                        }
                        }
    
                    // se copian los elementos que restan de la parte izquierda
                    while(izq <= medio){
                       arreglo[k++]=aux[izq++];
              }
              }
            }
    
            System.out.println("Arreglo ordenado: ");
            for(int k=0;k<arreglo.length;k++) {
               System.out.print(arreglo[k]+" ");
            }
         }
    
    
    

