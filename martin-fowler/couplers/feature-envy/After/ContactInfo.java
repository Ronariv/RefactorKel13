public class ContactInfo {
    public String GetStreetName()
        {
            return "1 Medison Square";
        }
        public String GetCity()
        {
            return "NewYork";
        }
        public String GetState()
        {
            return "NY";
        }
        public String GetFullAddress(ContactInfo info)
        {
            String city = info.GetCity();
            String state = info.GetState();
            String streetName = info.GetStreetName();
            return streetName + ";" + city + ";" + state;
        }
}