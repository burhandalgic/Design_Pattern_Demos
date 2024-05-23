package Creational._5_Prototype;

public class Document implements Cloneable {
    private DocumentType documentType;
    private int pagenumber;

    public Document(DocumentType documentType, int pagenumber) {
        this.documentType = documentType;
        this.pagenumber = pagenumber;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public int getPagenumber() {
        return pagenumber;
    }

    public void setPagenumber(int pagenumber) {
        this.pagenumber = pagenumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentType=" + documentType +
                ", pagenumber=" + pagenumber +
                '}';
    }
/*
Shallow copy , yüzeysel kopyalama
    @Override
    protected Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }
 */

    //Derin kopyalama
    @Override
    protected Document clone() throws CloneNotSupportedException {
        Document document=(Document) super.clone();
        DocumentType documentType1=document.getDocumentType().clone();
        document.setDocumentType(documentType1);
        return document;

    }







}
