// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a postal address, e.g. for postal delivery or payments addresses. Given a postal address, a postal service can deliver items to a premise, P.O. Box or similar. It is not intended to model geographical locations (roads, towns, mountains). In typical usage an address would be created via user input or from importing existing data, depending on the type of process. Advice on address input / editing: - Use an i18n-ready address widget such as https://github.com/google/libaddressinput) - Users should not be presented with UI elements for input or editing of fields outside countries where that field is used. For more guidance on how to use this schema, please see: https://support.google.com/business/answer/6397478
 * 
 */
public final class PostalAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final PostalAddressArgs Empty = new PostalAddressArgs();

    /**
     * Unstructured address lines describing the lower levels of an address. Because values in address_lines do not have type information and may sometimes contain multiple values in a single field (e.g. &#34;Austin, TX&#34;), it is important that the line order is clear. The order of address lines should be &#34;envelope order&#34; for the country/region of the address. In places where this can vary (e.g. Japan), address_language is used to make it explicit (e.g. &#34;ja&#34; for large-to-small ordering and &#34;ja-Latn&#34; or &#34;en&#34; for small-to-large). This way, the most specific line of an address can be selected based on the language. The minimum permitted structural representation of an address consists of a region_code with all remaining information placed in the address_lines. It would be possible to format such an address very approximately without geocoding, but no semantic reasoning could be made about any of the address components until it was at least partially resolved. Creating an address only containing a region_code and address_lines, and then geocoding is the recommended way to handle completely unstructured addresses (as opposed to guessing which parts of the address should be localities or administrative areas).
     * 
     */
    @Import(name="addressLines")
    private @Nullable Output<List<String>> addressLines;

    /**
     * @return Unstructured address lines describing the lower levels of an address. Because values in address_lines do not have type information and may sometimes contain multiple values in a single field (e.g. &#34;Austin, TX&#34;), it is important that the line order is clear. The order of address lines should be &#34;envelope order&#34; for the country/region of the address. In places where this can vary (e.g. Japan), address_language is used to make it explicit (e.g. &#34;ja&#34; for large-to-small ordering and &#34;ja-Latn&#34; or &#34;en&#34; for small-to-large). This way, the most specific line of an address can be selected based on the language. The minimum permitted structural representation of an address consists of a region_code with all remaining information placed in the address_lines. It would be possible to format such an address very approximately without geocoding, but no semantic reasoning could be made about any of the address components until it was at least partially resolved. Creating an address only containing a region_code and address_lines, and then geocoding is the recommended way to handle completely unstructured addresses (as opposed to guessing which parts of the address should be localities or administrative areas).
     * 
     */
    public Optional<Output<List<String>>> addressLines() {
        return Optional.ofNullable(this.addressLines);
    }

    /**
     * Optional. Highest administrative subdivision which is used for postal addresses of a country or region. For example, this can be a state, a province, an oblast, or a prefecture. Specifically, for Spain this is the province and not the autonomous community (e.g. &#34;Barcelona&#34; and not &#34;Catalonia&#34;). Many countries don&#39;t use an administrative area in postal addresses. E.g. in Switzerland this should be left unpopulated.
     * 
     */
    @Import(name="administrativeArea")
    private @Nullable Output<String> administrativeArea;

    /**
     * @return Optional. Highest administrative subdivision which is used for postal addresses of a country or region. For example, this can be a state, a province, an oblast, or a prefecture. Specifically, for Spain this is the province and not the autonomous community (e.g. &#34;Barcelona&#34; and not &#34;Catalonia&#34;). Many countries don&#39;t use an administrative area in postal addresses. E.g. in Switzerland this should be left unpopulated.
     * 
     */
    public Optional<Output<String>> administrativeArea() {
        return Optional.ofNullable(this.administrativeArea);
    }

    /**
     * Optional. BCP-47 language code of the contents of this address (if known). This is often the UI language of the input form or is expected to match one of the languages used in the address&#39; country/region, or their transliterated equivalents. This can affect formatting in certain countries, but is not critical to the correctness of the data and will never affect any validation or other non-formatting related operations. If this value is not known, it should be omitted (rather than specifying a possibly incorrect default). Examples: &#34;zh-Hant&#34;, &#34;ja&#34;, &#34;ja-Latn&#34;, &#34;en&#34;.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return Optional. BCP-47 language code of the contents of this address (if known). This is often the UI language of the input form or is expected to match one of the languages used in the address&#39; country/region, or their transliterated equivalents. This can affect formatting in certain countries, but is not critical to the correctness of the data and will never affect any validation or other non-formatting related operations. If this value is not known, it should be omitted (rather than specifying a possibly incorrect default). Examples: &#34;zh-Hant&#34;, &#34;ja&#34;, &#34;ja-Latn&#34;, &#34;en&#34;.
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    /**
     * Optional. Generally refers to the city/town portion of the address. Examples: US city, IT comune, UK post town. In regions of the world where localities are not well defined or do not fit into this structure well, leave locality empty and use address_lines.
     * 
     */
    @Import(name="locality")
    private @Nullable Output<String> locality;

    /**
     * @return Optional. Generally refers to the city/town portion of the address. Examples: US city, IT comune, UK post town. In regions of the world where localities are not well defined or do not fit into this structure well, leave locality empty and use address_lines.
     * 
     */
    public Optional<Output<String>> locality() {
        return Optional.ofNullable(this.locality);
    }

    /**
     * Optional. The name of the organization at the address.
     * 
     */
    @Import(name="organization")
    private @Nullable Output<String> organization;

    /**
     * @return Optional. The name of the organization at the address.
     * 
     */
    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    /**
     * Optional. Postal code of the address. Not all countries use or require postal codes to be present, but where they are used, they may trigger additional validation with other parts of the address (e.g. state/zip validation in the U.S.A.).
     * 
     */
    @Import(name="postalCode")
    private @Nullable Output<String> postalCode;

    /**
     * @return Optional. Postal code of the address. Not all countries use or require postal codes to be present, but where they are used, they may trigger additional validation with other parts of the address (e.g. state/zip validation in the U.S.A.).
     * 
     */
    public Optional<Output<String>> postalCode() {
        return Optional.ofNullable(this.postalCode);
    }

    /**
     * Optional. The recipient at the address. This field may, under certain circumstances, contain multiline information. For example, it might contain &#34;care of&#34; information.
     * 
     */
    @Import(name="recipients")
    private @Nullable Output<List<String>> recipients;

    /**
     * @return Optional. The recipient at the address. This field may, under certain circumstances, contain multiline information. For example, it might contain &#34;care of&#34; information.
     * 
     */
    public Optional<Output<List<String>>> recipients() {
        return Optional.ofNullable(this.recipients);
    }

    /**
     * CLDR region code of the country/region of the address. This is never inferred and it is up to the user to ensure the value is correct. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: &#34;CH&#34; for Switzerland.
     * 
     */
    @Import(name="regionCode", required=true)
    private Output<String> regionCode;

    /**
     * @return CLDR region code of the country/region of the address. This is never inferred and it is up to the user to ensure the value is correct. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: &#34;CH&#34; for Switzerland.
     * 
     */
    public Output<String> regionCode() {
        return this.regionCode;
    }

    /**
     * The schema revision of the `PostalAddress`. This must be set to 0, which is the latest revision. All new revisions **must** be backward compatible with old revisions.
     * 
     */
    @Import(name="revision")
    private @Nullable Output<Integer> revision;

    /**
     * @return The schema revision of the `PostalAddress`. This must be set to 0, which is the latest revision. All new revisions **must** be backward compatible with old revisions.
     * 
     */
    public Optional<Output<Integer>> revision() {
        return Optional.ofNullable(this.revision);
    }

    /**
     * Optional. Additional, country-specific, sorting code. This is not used in most regions. Where it is used, the value is either a string like &#34;CEDEX&#34;, optionally followed by a number (e.g. &#34;CEDEX 7&#34;), or just a number alone, representing the &#34;sector code&#34; (Jamaica), &#34;delivery area indicator&#34; (Malawi) or &#34;post office indicator&#34; (e.g. Côte d&#39;Ivoire).
     * 
     */
    @Import(name="sortingCode")
    private @Nullable Output<String> sortingCode;

    /**
     * @return Optional. Additional, country-specific, sorting code. This is not used in most regions. Where it is used, the value is either a string like &#34;CEDEX&#34;, optionally followed by a number (e.g. &#34;CEDEX 7&#34;), or just a number alone, representing the &#34;sector code&#34; (Jamaica), &#34;delivery area indicator&#34; (Malawi) or &#34;post office indicator&#34; (e.g. Côte d&#39;Ivoire).
     * 
     */
    public Optional<Output<String>> sortingCode() {
        return Optional.ofNullable(this.sortingCode);
    }

    /**
     * Optional. Sublocality of the address. For example, this can be neighborhoods, boroughs, districts.
     * 
     */
    @Import(name="sublocality")
    private @Nullable Output<String> sublocality;

    /**
     * @return Optional. Sublocality of the address. For example, this can be neighborhoods, boroughs, districts.
     * 
     */
    public Optional<Output<String>> sublocality() {
        return Optional.ofNullable(this.sublocality);
    }

    private PostalAddressArgs() {}

    private PostalAddressArgs(PostalAddressArgs $) {
        this.addressLines = $.addressLines;
        this.administrativeArea = $.administrativeArea;
        this.languageCode = $.languageCode;
        this.locality = $.locality;
        this.organization = $.organization;
        this.postalCode = $.postalCode;
        this.recipients = $.recipients;
        this.regionCode = $.regionCode;
        this.revision = $.revision;
        this.sortingCode = $.sortingCode;
        this.sublocality = $.sublocality;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PostalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PostalAddressArgs $;

        public Builder() {
            $ = new PostalAddressArgs();
        }

        public Builder(PostalAddressArgs defaults) {
            $ = new PostalAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressLines Unstructured address lines describing the lower levels of an address. Because values in address_lines do not have type information and may sometimes contain multiple values in a single field (e.g. &#34;Austin, TX&#34;), it is important that the line order is clear. The order of address lines should be &#34;envelope order&#34; for the country/region of the address. In places where this can vary (e.g. Japan), address_language is used to make it explicit (e.g. &#34;ja&#34; for large-to-small ordering and &#34;ja-Latn&#34; or &#34;en&#34; for small-to-large). This way, the most specific line of an address can be selected based on the language. The minimum permitted structural representation of an address consists of a region_code with all remaining information placed in the address_lines. It would be possible to format such an address very approximately without geocoding, but no semantic reasoning could be made about any of the address components until it was at least partially resolved. Creating an address only containing a region_code and address_lines, and then geocoding is the recommended way to handle completely unstructured addresses (as opposed to guessing which parts of the address should be localities or administrative areas).
         * 
         * @return builder
         * 
         */
        public Builder addressLines(@Nullable Output<List<String>> addressLines) {
            $.addressLines = addressLines;
            return this;
        }

        /**
         * @param addressLines Unstructured address lines describing the lower levels of an address. Because values in address_lines do not have type information and may sometimes contain multiple values in a single field (e.g. &#34;Austin, TX&#34;), it is important that the line order is clear. The order of address lines should be &#34;envelope order&#34; for the country/region of the address. In places where this can vary (e.g. Japan), address_language is used to make it explicit (e.g. &#34;ja&#34; for large-to-small ordering and &#34;ja-Latn&#34; or &#34;en&#34; for small-to-large). This way, the most specific line of an address can be selected based on the language. The minimum permitted structural representation of an address consists of a region_code with all remaining information placed in the address_lines. It would be possible to format such an address very approximately without geocoding, but no semantic reasoning could be made about any of the address components until it was at least partially resolved. Creating an address only containing a region_code and address_lines, and then geocoding is the recommended way to handle completely unstructured addresses (as opposed to guessing which parts of the address should be localities or administrative areas).
         * 
         * @return builder
         * 
         */
        public Builder addressLines(List<String> addressLines) {
            return addressLines(Output.of(addressLines));
        }

        /**
         * @param addressLines Unstructured address lines describing the lower levels of an address. Because values in address_lines do not have type information and may sometimes contain multiple values in a single field (e.g. &#34;Austin, TX&#34;), it is important that the line order is clear. The order of address lines should be &#34;envelope order&#34; for the country/region of the address. In places where this can vary (e.g. Japan), address_language is used to make it explicit (e.g. &#34;ja&#34; for large-to-small ordering and &#34;ja-Latn&#34; or &#34;en&#34; for small-to-large). This way, the most specific line of an address can be selected based on the language. The minimum permitted structural representation of an address consists of a region_code with all remaining information placed in the address_lines. It would be possible to format such an address very approximately without geocoding, but no semantic reasoning could be made about any of the address components until it was at least partially resolved. Creating an address only containing a region_code and address_lines, and then geocoding is the recommended way to handle completely unstructured addresses (as opposed to guessing which parts of the address should be localities or administrative areas).
         * 
         * @return builder
         * 
         */
        public Builder addressLines(String... addressLines) {
            return addressLines(List.of(addressLines));
        }

        /**
         * @param administrativeArea Optional. Highest administrative subdivision which is used for postal addresses of a country or region. For example, this can be a state, a province, an oblast, or a prefecture. Specifically, for Spain this is the province and not the autonomous community (e.g. &#34;Barcelona&#34; and not &#34;Catalonia&#34;). Many countries don&#39;t use an administrative area in postal addresses. E.g. in Switzerland this should be left unpopulated.
         * 
         * @return builder
         * 
         */
        public Builder administrativeArea(@Nullable Output<String> administrativeArea) {
            $.administrativeArea = administrativeArea;
            return this;
        }

        /**
         * @param administrativeArea Optional. Highest administrative subdivision which is used for postal addresses of a country or region. For example, this can be a state, a province, an oblast, or a prefecture. Specifically, for Spain this is the province and not the autonomous community (e.g. &#34;Barcelona&#34; and not &#34;Catalonia&#34;). Many countries don&#39;t use an administrative area in postal addresses. E.g. in Switzerland this should be left unpopulated.
         * 
         * @return builder
         * 
         */
        public Builder administrativeArea(String administrativeArea) {
            return administrativeArea(Output.of(administrativeArea));
        }

        /**
         * @param languageCode Optional. BCP-47 language code of the contents of this address (if known). This is often the UI language of the input form or is expected to match one of the languages used in the address&#39; country/region, or their transliterated equivalents. This can affect formatting in certain countries, but is not critical to the correctness of the data and will never affect any validation or other non-formatting related operations. If this value is not known, it should be omitted (rather than specifying a possibly incorrect default). Examples: &#34;zh-Hant&#34;, &#34;ja&#34;, &#34;ja-Latn&#34;, &#34;en&#34;.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode Optional. BCP-47 language code of the contents of this address (if known). This is often the UI language of the input form or is expected to match one of the languages used in the address&#39; country/region, or their transliterated equivalents. This can affect formatting in certain countries, but is not critical to the correctness of the data and will never affect any validation or other non-formatting related operations. If this value is not known, it should be omitted (rather than specifying a possibly incorrect default). Examples: &#34;zh-Hant&#34;, &#34;ja&#34;, &#34;ja-Latn&#34;, &#34;en&#34;.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        /**
         * @param locality Optional. Generally refers to the city/town portion of the address. Examples: US city, IT comune, UK post town. In regions of the world where localities are not well defined or do not fit into this structure well, leave locality empty and use address_lines.
         * 
         * @return builder
         * 
         */
        public Builder locality(@Nullable Output<String> locality) {
            $.locality = locality;
            return this;
        }

        /**
         * @param locality Optional. Generally refers to the city/town portion of the address. Examples: US city, IT comune, UK post town. In regions of the world where localities are not well defined or do not fit into this structure well, leave locality empty and use address_lines.
         * 
         * @return builder
         * 
         */
        public Builder locality(String locality) {
            return locality(Output.of(locality));
        }

        /**
         * @param organization Optional. The name of the organization at the address.
         * 
         * @return builder
         * 
         */
        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization Optional. The name of the organization at the address.
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param postalCode Optional. Postal code of the address. Not all countries use or require postal codes to be present, but where they are used, they may trigger additional validation with other parts of the address (e.g. state/zip validation in the U.S.A.).
         * 
         * @return builder
         * 
         */
        public Builder postalCode(@Nullable Output<String> postalCode) {
            $.postalCode = postalCode;
            return this;
        }

        /**
         * @param postalCode Optional. Postal code of the address. Not all countries use or require postal codes to be present, but where they are used, they may trigger additional validation with other parts of the address (e.g. state/zip validation in the U.S.A.).
         * 
         * @return builder
         * 
         */
        public Builder postalCode(String postalCode) {
            return postalCode(Output.of(postalCode));
        }

        /**
         * @param recipients Optional. The recipient at the address. This field may, under certain circumstances, contain multiline information. For example, it might contain &#34;care of&#34; information.
         * 
         * @return builder
         * 
         */
        public Builder recipients(@Nullable Output<List<String>> recipients) {
            $.recipients = recipients;
            return this;
        }

        /**
         * @param recipients Optional. The recipient at the address. This field may, under certain circumstances, contain multiline information. For example, it might contain &#34;care of&#34; information.
         * 
         * @return builder
         * 
         */
        public Builder recipients(List<String> recipients) {
            return recipients(Output.of(recipients));
        }

        /**
         * @param recipients Optional. The recipient at the address. This field may, under certain circumstances, contain multiline information. For example, it might contain &#34;care of&#34; information.
         * 
         * @return builder
         * 
         */
        public Builder recipients(String... recipients) {
            return recipients(List.of(recipients));
        }

        /**
         * @param regionCode CLDR region code of the country/region of the address. This is never inferred and it is up to the user to ensure the value is correct. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: &#34;CH&#34; for Switzerland.
         * 
         * @return builder
         * 
         */
        public Builder regionCode(Output<String> regionCode) {
            $.regionCode = regionCode;
            return this;
        }

        /**
         * @param regionCode CLDR region code of the country/region of the address. This is never inferred and it is up to the user to ensure the value is correct. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: &#34;CH&#34; for Switzerland.
         * 
         * @return builder
         * 
         */
        public Builder regionCode(String regionCode) {
            return regionCode(Output.of(regionCode));
        }

        /**
         * @param revision The schema revision of the `PostalAddress`. This must be set to 0, which is the latest revision. All new revisions **must** be backward compatible with old revisions.
         * 
         * @return builder
         * 
         */
        public Builder revision(@Nullable Output<Integer> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision The schema revision of the `PostalAddress`. This must be set to 0, which is the latest revision. All new revisions **must** be backward compatible with old revisions.
         * 
         * @return builder
         * 
         */
        public Builder revision(Integer revision) {
            return revision(Output.of(revision));
        }

        /**
         * @param sortingCode Optional. Additional, country-specific, sorting code. This is not used in most regions. Where it is used, the value is either a string like &#34;CEDEX&#34;, optionally followed by a number (e.g. &#34;CEDEX 7&#34;), or just a number alone, representing the &#34;sector code&#34; (Jamaica), &#34;delivery area indicator&#34; (Malawi) or &#34;post office indicator&#34; (e.g. Côte d&#39;Ivoire).
         * 
         * @return builder
         * 
         */
        public Builder sortingCode(@Nullable Output<String> sortingCode) {
            $.sortingCode = sortingCode;
            return this;
        }

        /**
         * @param sortingCode Optional. Additional, country-specific, sorting code. This is not used in most regions. Where it is used, the value is either a string like &#34;CEDEX&#34;, optionally followed by a number (e.g. &#34;CEDEX 7&#34;), or just a number alone, representing the &#34;sector code&#34; (Jamaica), &#34;delivery area indicator&#34; (Malawi) or &#34;post office indicator&#34; (e.g. Côte d&#39;Ivoire).
         * 
         * @return builder
         * 
         */
        public Builder sortingCode(String sortingCode) {
            return sortingCode(Output.of(sortingCode));
        }

        /**
         * @param sublocality Optional. Sublocality of the address. For example, this can be neighborhoods, boroughs, districts.
         * 
         * @return builder
         * 
         */
        public Builder sublocality(@Nullable Output<String> sublocality) {
            $.sublocality = sublocality;
            return this;
        }

        /**
         * @param sublocality Optional. Sublocality of the address. For example, this can be neighborhoods, boroughs, districts.
         * 
         * @return builder
         * 
         */
        public Builder sublocality(String sublocality) {
            return sublocality(Output.of(sublocality));
        }

        public PostalAddressArgs build() {
            $.regionCode = Objects.requireNonNull($.regionCode, "expected parameter 'regionCode' to be non-null");
            return $;
        }
    }

}
