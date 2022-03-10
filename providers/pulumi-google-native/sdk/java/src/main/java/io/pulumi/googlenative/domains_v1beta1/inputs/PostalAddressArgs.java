// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a postal address, e.g. for postal delivery or payments addresses. Given a postal address, a postal service can deliver items to a premise, P.O. Box or similar. It is not intended to model geographical locations (roads, towns, mountains). In typical usage an address would be created via user input or from importing existing data, depending on the type of process. Advice on address input / editing: - Use an i18n-ready address widget such as https://github.com/google/libaddressinput) - Users should not be presented with UI elements for input or editing of fields outside countries where that field is used. For more guidance on how to use this schema, please see: https://support.google.com/business/answer/6397478
 * 
 */
public final class PostalAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final PostalAddressArgs Empty = new PostalAddressArgs();

    /**
     * Unstructured address lines describing the lower levels of an address. Because values in address_lines do not have type information and may sometimes contain multiple values in a single field (e.g. "Austin, TX"), it is important that the line order is clear. The order of address lines should be "envelope order" for the country/region of the address. In places where this can vary (e.g. Japan), address_language is used to make it explicit (e.g. "ja" for large-to-small ordering and "ja-Latn" or "en" for small-to-large). This way, the most specific line of an address can be selected based on the language. The minimum permitted structural representation of an address consists of a region_code with all remaining information placed in the address_lines. It would be possible to format such an address very approximately without geocoding, but no semantic reasoning could be made about any of the address components until it was at least partially resolved. Creating an address only containing a region_code and address_lines, and then geocoding is the recommended way to handle completely unstructured addresses (as opposed to guessing which parts of the address should be localities or administrative areas).
     * 
     */
    @InputImport(name="addressLines")
      private final @Nullable Input<List<String>> addressLines;

    public Input<List<String>> getAddressLines() {
        return this.addressLines == null ? Input.empty() : this.addressLines;
    }

    /**
     * Optional. Highest administrative subdivision which is used for postal addresses of a country or region. For example, this can be a state, a province, an oblast, or a prefecture. Specifically, for Spain this is the province and not the autonomous community (e.g. "Barcelona" and not "Catalonia"). Many countries don't use an administrative area in postal addresses. E.g. in Switzerland this should be left unpopulated.
     * 
     */
    @InputImport(name="administrativeArea")
      private final @Nullable Input<String> administrativeArea;

    public Input<String> getAdministrativeArea() {
        return this.administrativeArea == null ? Input.empty() : this.administrativeArea;
    }

    /**
     * Optional. BCP-47 language code of the contents of this address (if known). This is often the UI language of the input form or is expected to match one of the languages used in the address' country/region, or their transliterated equivalents. This can affect formatting in certain countries, but is not critical to the correctness of the data and will never affect any validation or other non-formatting related operations. If this value is not known, it should be omitted (rather than specifying a possibly incorrect default). Examples: "zh-Hant", "ja", "ja-Latn", "en".
     * 
     */
    @InputImport(name="languageCode")
      private final @Nullable Input<String> languageCode;

    public Input<String> getLanguageCode() {
        return this.languageCode == null ? Input.empty() : this.languageCode;
    }

    /**
     * Optional. Generally refers to the city/town portion of the address. Examples: US city, IT comune, UK post town. In regions of the world where localities are not well defined or do not fit into this structure well, leave locality empty and use address_lines.
     * 
     */
    @InputImport(name="locality")
      private final @Nullable Input<String> locality;

    public Input<String> getLocality() {
        return this.locality == null ? Input.empty() : this.locality;
    }

    /**
     * Optional. The name of the organization at the address.
     * 
     */
    @InputImport(name="organization")
      private final @Nullable Input<String> organization;

    public Input<String> getOrganization() {
        return this.organization == null ? Input.empty() : this.organization;
    }

    /**
     * Optional. Postal code of the address. Not all countries use or require postal codes to be present, but where they are used, they may trigger additional validation with other parts of the address (e.g. state/zip validation in the U.S.A.).
     * 
     */
    @InputImport(name="postalCode")
      private final @Nullable Input<String> postalCode;

    public Input<String> getPostalCode() {
        return this.postalCode == null ? Input.empty() : this.postalCode;
    }

    /**
     * Optional. The recipient at the address. This field may, under certain circumstances, contain multiline information. For example, it might contain "care of" information.
     * 
     */
    @InputImport(name="recipients")
      private final @Nullable Input<List<String>> recipients;

    public Input<List<String>> getRecipients() {
        return this.recipients == null ? Input.empty() : this.recipients;
    }

    /**
     * CLDR region code of the country/region of the address. This is never inferred and it is up to the user to ensure the value is correct. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: "CH" for Switzerland.
     * 
     */
    @InputImport(name="regionCode", required=true)
      private final Input<String> regionCode;

    public Input<String> getRegionCode() {
        return this.regionCode;
    }

    /**
     * The schema revision of the `PostalAddress`. This must be set to 0, which is the latest revision. All new revisions **must** be backward compatible with old revisions.
     * 
     */
    @InputImport(name="revision")
      private final @Nullable Input<Integer> revision;

    public Input<Integer> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    /**
     * Optional. Additional, country-specific, sorting code. This is not used in most regions. Where it is used, the value is either a string like "CEDEX", optionally followed by a number (e.g. "CEDEX 7"), or just a number alone, representing the "sector code" (Jamaica), "delivery area indicator" (Malawi) or "post office indicator" (e.g. Côte d'Ivoire).
     * 
     */
    @InputImport(name="sortingCode")
      private final @Nullable Input<String> sortingCode;

    public Input<String> getSortingCode() {
        return this.sortingCode == null ? Input.empty() : this.sortingCode;
    }

    /**
     * Optional. Sublocality of the address. For example, this can be neighborhoods, boroughs, districts.
     * 
     */
    @InputImport(name="sublocality")
      private final @Nullable Input<String> sublocality;

    public Input<String> getSublocality() {
        return this.sublocality == null ? Input.empty() : this.sublocality;
    }

    public PostalAddressArgs(
        @Nullable Input<List<String>> addressLines,
        @Nullable Input<String> administrativeArea,
        @Nullable Input<String> languageCode,
        @Nullable Input<String> locality,
        @Nullable Input<String> organization,
        @Nullable Input<String> postalCode,
        @Nullable Input<List<String>> recipients,
        Input<String> regionCode,
        @Nullable Input<Integer> revision,
        @Nullable Input<String> sortingCode,
        @Nullable Input<String> sublocality) {
        this.addressLines = addressLines;
        this.administrativeArea = administrativeArea;
        this.languageCode = languageCode;
        this.locality = locality;
        this.organization = organization;
        this.postalCode = postalCode;
        this.recipients = recipients;
        this.regionCode = Objects.requireNonNull(regionCode, "expected parameter 'regionCode' to be non-null");
        this.revision = revision;
        this.sortingCode = sortingCode;
        this.sublocality = sublocality;
    }

    private PostalAddressArgs() {
        this.addressLines = Input.empty();
        this.administrativeArea = Input.empty();
        this.languageCode = Input.empty();
        this.locality = Input.empty();
        this.organization = Input.empty();
        this.postalCode = Input.empty();
        this.recipients = Input.empty();
        this.regionCode = Input.empty();
        this.revision = Input.empty();
        this.sortingCode = Input.empty();
        this.sublocality = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostalAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> addressLines;
        private @Nullable Input<String> administrativeArea;
        private @Nullable Input<String> languageCode;
        private @Nullable Input<String> locality;
        private @Nullable Input<String> organization;
        private @Nullable Input<String> postalCode;
        private @Nullable Input<List<String>> recipients;
        private Input<String> regionCode;
        private @Nullable Input<Integer> revision;
        private @Nullable Input<String> sortingCode;
        private @Nullable Input<String> sublocality;

        public Builder() {
    	      // Empty
        }

        public Builder(PostalAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressLines = defaults.addressLines;
    	      this.administrativeArea = defaults.administrativeArea;
    	      this.languageCode = defaults.languageCode;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.postalCode = defaults.postalCode;
    	      this.recipients = defaults.recipients;
    	      this.regionCode = defaults.regionCode;
    	      this.revision = defaults.revision;
    	      this.sortingCode = defaults.sortingCode;
    	      this.sublocality = defaults.sublocality;
        }

        public Builder addressLines(@Nullable Input<List<String>> addressLines) {
            this.addressLines = addressLines;
            return this;
        }

        public Builder addressLines(@Nullable List<String> addressLines) {
            this.addressLines = Input.ofNullable(addressLines);
            return this;
        }

        public Builder administrativeArea(@Nullable Input<String> administrativeArea) {
            this.administrativeArea = administrativeArea;
            return this;
        }

        public Builder administrativeArea(@Nullable String administrativeArea) {
            this.administrativeArea = Input.ofNullable(administrativeArea);
            return this;
        }

        public Builder languageCode(@Nullable Input<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = Input.ofNullable(languageCode);
            return this;
        }

        public Builder locality(@Nullable Input<String> locality) {
            this.locality = locality;
            return this;
        }

        public Builder locality(@Nullable String locality) {
            this.locality = Input.ofNullable(locality);
            return this;
        }

        public Builder organization(@Nullable Input<String> organization) {
            this.organization = organization;
            return this;
        }

        public Builder organization(@Nullable String organization) {
            this.organization = Input.ofNullable(organization);
            return this;
        }

        public Builder postalCode(@Nullable Input<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder postalCode(@Nullable String postalCode) {
            this.postalCode = Input.ofNullable(postalCode);
            return this;
        }

        public Builder recipients(@Nullable Input<List<String>> recipients) {
            this.recipients = recipients;
            return this;
        }

        public Builder recipients(@Nullable List<String> recipients) {
            this.recipients = Input.ofNullable(recipients);
            return this;
        }

        public Builder regionCode(Input<String> regionCode) {
            this.regionCode = Objects.requireNonNull(regionCode);
            return this;
        }

        public Builder regionCode(String regionCode) {
            this.regionCode = Input.of(Objects.requireNonNull(regionCode));
            return this;
        }

        public Builder revision(@Nullable Input<Integer> revision) {
            this.revision = revision;
            return this;
        }

        public Builder revision(@Nullable Integer revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }

        public Builder sortingCode(@Nullable Input<String> sortingCode) {
            this.sortingCode = sortingCode;
            return this;
        }

        public Builder sortingCode(@Nullable String sortingCode) {
            this.sortingCode = Input.ofNullable(sortingCode);
            return this;
        }

        public Builder sublocality(@Nullable Input<String> sublocality) {
            this.sublocality = sublocality;
            return this;
        }

        public Builder sublocality(@Nullable String sublocality) {
            this.sublocality = Input.ofNullable(sublocality);
            return this;
        }
        public PostalAddressArgs build() {
            return new PostalAddressArgs(addressLines, administrativeArea, languageCode, locality, organization, postalCode, recipients, regionCode, revision, sortingCode, sublocality);
        }
    }
}
