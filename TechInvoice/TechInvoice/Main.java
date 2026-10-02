public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE 1: SINGLETON ===");
        GerenciadorConfiguracao gen1 = GerenciadorConfiguracao.getInstance();
        System.out.println("Chave de API (gen1): " + gen1.getApiKey());

        GerenciadorConfiguracao gen2 = GerenciadorConfiguracao.getInstance();
        if (gen1 == gen2) {
            System.out.println("Sucesso: gen1 e gen2 apontam para a mesma instância na memória RAM!");
        }

        System.out.println("\n=== TESTE 2: FACTORY (DOCUMENTO VÁLIDO) ===");
        IDocumento notaFiscal = DocumentoFactory.criarDocumento("NF");
        notaFiscal.gerarPDF();

        System.out.println("\n=== TESTE 3: FACTORY (TRATAMENTO DE EXCEÇÃO) ===");
        try {
            IDocumento boleto = DocumentoFactory.criarDocumento("BOLETO");
            boleto.gerarPDF();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado com sucesso: " + e.getMessage());
        }
    }
}
