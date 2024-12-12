package org.example.task3;

public class CompanyReaderFacade {

    private PDLReader pdlReader;
    private BrandFetchReader brandFetchReader;
    private WebScrapper scrapper;
    private ChatGPT chatGPT;

    public CompanyReaderFacade() {
        this.pdlReader = new PDLReader();
        this.brandFetchReader = new BrandFetchReader();
        this.scrapper = new WebScrapper("https://www.google.com");
        this.chatGPT = new ChatGPT("test");
    }

    public Company fetch(String companyName) {
        Company pdlCompany = pdlReader.fetch(companyName);
        Company bfCompany = brandFetchReader.fetchCompany(companyName);
        Company scrappedCompany = chatGPT.extractCompanyDetails(scrapper.fetchData(companyName));
        return combineData(pdlCompany, bfCompany, scrappedCompany);
    }

    public static Company combineData(Company pdlCompany, Company bfCompany, Company scrappedCompany) {
        String name = pdlCompany.getName() != null ? pdlCompany.getName() :
                bfCompany.getName() != null ? bfCompany.getName() : scrappedCompany.getName();

        String description = pdlCompany.getDescription() != null ? pdlCompany.getDescription() :
                bfCompany.getDescription() != null ? bfCompany.getDescription() : scrappedCompany.getDescription();

        return new Company(name, description);
    }

}
