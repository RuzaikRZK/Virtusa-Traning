public class SSF extends  Handler{
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getTax() + invoice.getAmount() * 0.02);
        System.out.println("SSF Calculated!");

        return  invoice.getTax();
    }
}
