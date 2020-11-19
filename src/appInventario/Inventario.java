package appInventario;

public class Inventario {

    /*
        Que tiene un inventario ? y
        Que sabe hacer?
    */
    
    //Lista de productos
    Producto lista [] = new Producto[10];
    
    
    
    
    
    void agregar(int c, Producto prod)
    {
        boolean existe = false;
        
        for(int i = 0; i < lista.length; i++)
        {
            if(lista[i] != null && lista[i].nombre.equals(prod.nombre))
            {
                lista[i].cantidad += c;
                existe = true;
                break;
            }
        }
        
        if(!existe)
        {
            for(int i = 0; i < lista.length; i++)
            {
                if(lista[i] == null) // encontrando el primer espacio vacio
                {
                    lista[i] = prod;
                    lista[i].cantidad += c;
                    existe = true;
                    break;
                }    
            }
        }
        
        
        if(!existe)
        {
            System.out.println("Arreglo lleno");
        }
        
    }
    
    
    //que regresa      como se llama el metodo o funcion      que parametros recibe para hacer la busqueda
    Producto           buscar                                 (String nom)
    {
        for(int i = 0; i < lista.length; i++)
        {
            if(lista[i] != null && lista[i].nombre.equals(nom)) // si lo encontre
            {
                return lista[i];                
            }    
        }
        
        return null;
    }
    
    void sustraer(int c, Producto prod)
    {
    
        Producto p = buscar(prod.nombre);
        
        if(p != null && p.cantidad >= c)
        {
            p.cantidad = p.cantidad - c;
        }
        else
        {
            if(p == null)
                System.out.println("El producto no existe en la bodega");
            else
                System.out.println("La cantidad que solicitas es mayor a la del Inventario, lantidad actual igual a: " + p.cantidad);
           
        }
    }
    
}



