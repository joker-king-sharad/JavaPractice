import javax.swing.text.AbstractDocument.BranchElement;

class Laptop{
    String Brand;
    String Series;
    String ProcessorBrand;
    String Processortype;
    int Ram;
    String StorageType;
    int StrogeSize_GB;
}

class OppsClass2 {
    public static void main(String[] args) {
        // Laptop Object
        Laptop tuf=new Laptop();
        tuf.Brand="ASUS";
        tuf.Series="TUF Gaming A15";
        tuf.ProcessorBrand="AMD";
        tuf.Processortype="Ryzen 5";
        tuf.Ram=16;
        tuf.StorageType="SSD";
        tuf.StrogeSize_GB=512;

        Laptop aspire=new Laptop();
        aspire.Brand="Acer";
        aspire.Series="Aspire 5";
    }

}
