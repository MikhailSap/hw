package sap.ru.hw.hw01.builder;

import lombok.Setter;

@Setter
public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public static Builder newBuilder() {
        return new Person().new Builder();
    }


    public class Builder {

        private Builder() {
        }

        public Builder setFirstName(String firstName) {
            Person.this.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName) {
            Person.this.setLastName(lastName);
            return this;
        }

        public Builder setMiddleName(String middleName) {
            Person.this.setMiddleName(middleName);
            return this;
        }

        public Builder setCountry(String country) {
            Person.this.setCountry(country);
            return this;
        }

        public Builder setAddress(String address) {
            Person.this.setAddress(address);
            return this;
        }

        public Builder setPhone(String phone) {
            Person.this.setPhone(phone);
            return this;
        }

        public Builder setAge(int age) {
            Person.this.setAge(age);
            return this;
        }

        public Builder setGender(String gender) {
            Person.this.setGender(gender);
            return this;
        }

        public Person build() {
            return Person.this;
        }
    }
}
