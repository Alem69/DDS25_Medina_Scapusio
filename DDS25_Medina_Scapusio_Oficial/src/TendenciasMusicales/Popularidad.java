package TendenciasMusicales;

public enum Popularidad {
    NORMAL(Icono.MUSICAL_NOTE),
    EN_AUGE(Icono.ROCKET),
    EN_TENDENCIA(Icono.FIRE);

    private Icono icono;

    TipoPopularidad(Icono icono)
    {
        this.icono = icono;
    }

    public Icono getIcono()
    {
        return icono;
    }

}
