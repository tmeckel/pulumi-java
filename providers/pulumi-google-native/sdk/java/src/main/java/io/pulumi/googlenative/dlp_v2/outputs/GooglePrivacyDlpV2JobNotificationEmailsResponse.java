// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2JobNotificationEmailsResponse {
    @OutputCustomType.Constructor({})
    private GooglePrivacyDlpV2JobNotificationEmailsResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2JobNotificationEmailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2JobNotificationEmailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GooglePrivacyDlpV2JobNotificationEmailsResponse build() {
            return new GooglePrivacyDlpV2JobNotificationEmailsResponse();
        }
    }
}
