// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An intended audience of the Product for whom it's sold.
 * 
 */
public final class GoogleCloudRetailV2betaAudienceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaAudienceResponse Empty = new GoogleCloudRetailV2betaAudienceResponse();

    /**
     * The age groups of the audience. Strongly encouraged to use the standard values: "newborn" (up to 3 months old), "infant" (3–12 months old), "toddler" (1–5 years old), "kids" (5–13 years old), "adult" (typically teens or older). At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [age_group](https://support.google.com/merchants/answer/6324463). Schema.org property [Product.audience.suggestedMinAge](https://schema.org/suggestedMinAge) and [Product.audience.suggestedMaxAge](https://schema.org/suggestedMaxAge).
     * 
     */
    @InputImport(name="ageGroups", required=true)
      private final List<String> ageGroups;

    public List<String> getAgeGroups() {
        return this.ageGroups;
    }

    /**
     * The genders of the audience. Strongly encouraged to use the standard values: "male", "female", "unisex". At most 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [gender](https://support.google.com/merchants/answer/6324479). Schema.org property [Product.audience.suggestedGender](https://schema.org/suggestedGender).
     * 
     */
    @InputImport(name="genders", required=true)
      private final List<String> genders;

    public List<String> getGenders() {
        return this.genders;
    }

    public GoogleCloudRetailV2betaAudienceResponse(
        List<String> ageGroups,
        List<String> genders) {
        this.ageGroups = Objects.requireNonNull(ageGroups, "expected parameter 'ageGroups' to be non-null");
        this.genders = Objects.requireNonNull(genders, "expected parameter 'genders' to be non-null");
    }

    private GoogleCloudRetailV2betaAudienceResponse() {
        this.ageGroups = List.of();
        this.genders = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaAudienceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> ageGroups;
        private List<String> genders;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaAudienceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ageGroups = defaults.ageGroups;
    	      this.genders = defaults.genders;
        }

        public Builder ageGroups(List<String> ageGroups) {
            this.ageGroups = Objects.requireNonNull(ageGroups);
            return this;
        }

        public Builder genders(List<String> genders) {
            this.genders = Objects.requireNonNull(genders);
            return this;
        }
        public GoogleCloudRetailV2betaAudienceResponse build() {
            return new GoogleCloudRetailV2betaAudienceResponse(ageGroups, genders);
        }
    }
}
