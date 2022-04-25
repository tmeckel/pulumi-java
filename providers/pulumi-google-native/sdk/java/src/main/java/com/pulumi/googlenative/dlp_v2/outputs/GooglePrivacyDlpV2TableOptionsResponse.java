// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2TableOptionsResponse {
    /**
     * @return The columns that are the primary keys for table objects included in ContentItem. A copy of this cell&#39;s value will stored alongside alongside each finding so that the finding can be traced to the specific row it came from. No more than 3 may be provided.
     * 
     */
    private final List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields;

    @CustomType.Constructor
    private GooglePrivacyDlpV2TableOptionsResponse(@CustomType.Parameter("identifyingFields") List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields) {
        this.identifyingFields = identifyingFields;
    }

    /**
     * @return The columns that are the primary keys for table objects included in ContentItem. A copy of this cell&#39;s value will stored alongside alongside each finding so that the finding can be traced to the specific row it came from. No more than 3 may be provided.
     * 
     */
    public List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields() {
        return this.identifyingFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TableOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TableOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifyingFields = defaults.identifyingFields;
        }

        public Builder identifyingFields(List<GooglePrivacyDlpV2FieldIdResponse> identifyingFields) {
            this.identifyingFields = Objects.requireNonNull(identifyingFields);
            return this;
        }
        public Builder identifyingFields(GooglePrivacyDlpV2FieldIdResponse... identifyingFields) {
            return identifyingFields(List.of(identifyingFields));
        }        public GooglePrivacyDlpV2TableOptionsResponse build() {
            return new GooglePrivacyDlpV2TableOptionsResponse(identifyingFields);
        }
    }
}
