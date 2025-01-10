class Foctory  {
    public static Inovoice getInovoicetype(int inovocetype)
    {
        switch(inovocetype)
        {
            case 1:return new Inovoice_wall();
            case 2:return new Inovoice_wf();
            case 3:return new Inovoice_wfwoh();
            case 4:return new Inovoice_wh();
            case 5:return new Inovoice_whwof();
            case 6:return new Inovoice_woall();
        }
                return null;
        
    }
}
