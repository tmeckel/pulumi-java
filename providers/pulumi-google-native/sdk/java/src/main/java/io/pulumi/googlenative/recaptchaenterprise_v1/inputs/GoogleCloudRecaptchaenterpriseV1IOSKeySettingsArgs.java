// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings specific to keys that can be used by iOS apps.
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs Empty = new GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs();

    /**
     * If set to true, allowed_bundle_ids are not enforced.
     * 
     */
    @Import(name="allowAllBundleIds")
      private final @Nullable Output<Boolean> allowAllBundleIds;

    public Output<Boolean> getAllowAllBundleIds() {
        return this.allowAllBundleIds == null ? Codegen.empty() : this.allowAllBundleIds;
    }

    /**
     * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
     * 
     */
    @Import(name="allowedBundleIds")
      private final @Nullable Output<List<String>> allowedBundleIds;

    public Output<List<String>> getAllowedBundleIds() {
        return this.allowedBundleIds == null ? Codegen.empty() : this.allowedBundleIds;
    }

    public GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs(
        @Nullable Output<Boolean> allowAllBundleIds,
        @Nullable Output<List<String>> allowedBundleIds) {
        this.allowAllBundleIds = allowAllBundleIds;
        this.allowedBundleIds = allowedBundleIds;
    }

    private GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs() {
        this.allowAllBundleIds = Codegen.empty();
        this.allowedBundleIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowAllBundleIds;
        private @Nullable Output<List<String>> allowedBundleIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllBundleIds = defaults.allowAllBundleIds;
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        public Builder allowAllBundleIds(@Nullable Output<Boolean> allowAllBundleIds) {
            this.allowAllBundleIds = allowAllBundleIds;
            return this;
        }
        public Builder allowAllBundleIds(@Nullable Boolean allowAllBundleIds) {
            this.allowAllBundleIds = Codegen.ofNullable(allowAllBundleIds);
            return this;
        }
        public Builder allowedBundleIds(@Nullable Output<List<String>> allowedBundleIds) {
            this.allowedBundleIds = allowedBundleIds;
            return this;
        }
        public Builder allowedBundleIds(@Nullable List<String> allowedBundleIds) {
            this.allowedBundleIds = Codegen.ofNullable(allowedBundleIds);
            return this;
        }
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }        public GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs build() {
            return new GoogleCloudRecaptchaenterpriseV1IOSKeySettingsArgs(allowAllBundleIds, allowedBundleIds);
        }
    }
}
