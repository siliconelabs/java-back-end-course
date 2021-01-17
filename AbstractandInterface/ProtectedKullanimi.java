package AbstractandInterface;

public class ProtectedKullanimi {

    protected int protectedDegisken;
    protected void protectedMetot(){

    }


}
class G extends ProtectedKullanimi{

    @Override
    protected void protectedMetot() {
        super.protectedMetot();
        System.out.println(protectedDegisken);
    }
}
