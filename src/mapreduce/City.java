package mapreduce;

public class City {

    private String Name;
    private String Country;
    private String Subcountry;
    private String Geonameid;

    public City(String name, String country, String subCountry, String geoId) {
        this.Name = name;
        this.Country = country;
        this.Subcountry = subCountry;
        this.Geonameid = geoId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getSubcountry() {
        return Subcountry;
    }

    public void setSubcountry(String Subcountry) {
        this.Subcountry = Subcountry;
    }

    public String getGeonameid() {
        return Geonameid;
    }

    public void setGeonameid(String Geonameid) {
        this.Geonameid = Geonameid;
    }

}
