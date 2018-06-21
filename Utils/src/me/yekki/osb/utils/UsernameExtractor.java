package me.yekki.osb.utils;

import javax.xml.bind.DatatypeConverter;

public class UsernameExtractor {
    public static String extract(String pHttpAuthenticationToken) {

        final String authenticationTokenWithoutBasicPrefix = pHttpAuthenticationToken.substring(6);

        final String base64DecodedAuthorizationString =
            new String(DatatypeConverter.parseBase64Binary(authenticationTokenWithoutBasicPrefix));

        return base64DecodedAuthorizationString.split(":")[0];
    }
}
