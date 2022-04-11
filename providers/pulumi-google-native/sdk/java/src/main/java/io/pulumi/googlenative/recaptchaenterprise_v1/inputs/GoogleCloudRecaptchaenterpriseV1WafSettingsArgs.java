// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.recaptchaenterprise_v1.enums.GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature;
import io.pulumi.googlenative.recaptchaenterprise_v1.enums.GoogleCloudRecaptchaenterpriseV1WafSettingsWafService;
import java.util.Objects;


/**
 * Settings specific to keys that can be used for WAF (Web Application Firewall).
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1WafSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecaptchaenterpriseV1WafSettingsArgs Empty = new GoogleCloudRecaptchaenterpriseV1WafSettingsArgs();

    /**
     * The WAF feature for which this key is enabled.
     * 
     */
    @Import(name="wafFeature", required=true)
      private final Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature> wafFeature;

    public Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature> getWafFeature() {
        return this.wafFeature;
    }

    /**
     * The WAF service that uses this key.
     * 
     */
    @Import(name="wafService", required=true)
      private final Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafService> wafService;

    public Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafService> getWafService() {
        return this.wafService;
    }

    public GoogleCloudRecaptchaenterpriseV1WafSettingsArgs(
        Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature> wafFeature,
        Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafService> wafService) {
        this.wafFeature = Objects.requireNonNull(wafFeature, "expected parameter 'wafFeature' to be non-null");
        this.wafService = Objects.requireNonNull(wafService, "expected parameter 'wafService' to be non-null");
    }

    private GoogleCloudRecaptchaenterpriseV1WafSettingsArgs() {
        this.wafFeature = Codegen.empty();
        this.wafService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1WafSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature> wafFeature;
        private Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafService> wafService;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1WafSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.wafFeature = defaults.wafFeature;
    	      this.wafService = defaults.wafService;
        }

        public Builder wafFeature(Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature> wafFeature) {
            this.wafFeature = Objects.requireNonNull(wafFeature);
            return this;
        }
        public Builder wafFeature(GoogleCloudRecaptchaenterpriseV1WafSettingsWafFeature wafFeature) {
            this.wafFeature = Output.of(Objects.requireNonNull(wafFeature));
            return this;
        }
        public Builder wafService(Output<GoogleCloudRecaptchaenterpriseV1WafSettingsWafService> wafService) {
            this.wafService = Objects.requireNonNull(wafService);
            return this;
        }
        public Builder wafService(GoogleCloudRecaptchaenterpriseV1WafSettingsWafService wafService) {
            this.wafService = Output.of(Objects.requireNonNull(wafService));
            return this;
        }        public GoogleCloudRecaptchaenterpriseV1WafSettingsArgs build() {
            return new GoogleCloudRecaptchaenterpriseV1WafSettingsArgs(wafFeature, wafService);
        }
    }
}
