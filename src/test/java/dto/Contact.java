package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contact {
    String salutation,
            firstName,
            middleName,
            lastName,
            suffix,
            accountName,
            title,
            Department,
            email,
            fax,
            phone,
            mobile,
            mailingCountry,
            mailingCity,
            mailingZip,
            mailingStreet;


}
