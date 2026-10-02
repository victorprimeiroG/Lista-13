public class DocumentoFactory {
    public static IDocumento criarDocumento(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de documento não pode ser nulo.");
        }
        switch (tipo.toUpperCase()) {
            case "NF":
                return new NotaFiscal();
            case "RECIBO":
                return new Recibo();
            default:
                throw new IllegalArgumentException("Tipo de documento inválido: " + tipo);
        }
    }
}
