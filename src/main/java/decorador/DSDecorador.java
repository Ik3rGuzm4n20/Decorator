
package decorador;


public class DSDecorador implements DataSource{
    private DataSource wrappee;
    
    DSDecorador(DataSource source){
        this.wrappee = source;
    }
    
    @Override
    public void writeData(String data){
        wrappee.writeData(data);
    }
    
    @Override
    public String readData(){
        return wrappee.readData();
    }
}
