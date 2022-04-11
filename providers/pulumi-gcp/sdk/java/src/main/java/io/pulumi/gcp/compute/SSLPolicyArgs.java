// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SSLPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SSLPolicyArgs Empty = new SSLPolicyArgs();

    /**
     * Profile specifies the set of SSL features that can be used by the
     * load balancer when negotiating SSL with clients. This can be one of
     * `COMPATIBLE`, `MODERN`, `RESTRICTED`, or `CUSTOM`. If using `CUSTOM`,
     * the set of SSL features to enable must be specified in the
     * `customFeatures` field.
     * See the [official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies#profilefeaturesupport)
     * for which ciphers are available to use. **Note**: this argument
     * *must* be present when using the `CUSTOM` profile. This argument
     * *must not* be present when using any other profile.
     * 
     */
    @Import(name="customFeatures")
      private final @Nullable Output<List<String>> customFeatures;

    public Output<List<String>> getCustomFeatures() {
        return this.customFeatures == null ? Codegen.empty() : this.customFeatures;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The minimum version of SSL protocol that can be used by the clients
     * to establish a connection with the load balancer.
     * Default value is `TLS_1_0`.
     * Possible values are `TLS_1_0`, `TLS_1_1`, and `TLS_1_2`.
     * 
     */
    @Import(name="minTlsVersion")
      private final @Nullable Output<String> minTlsVersion;

    public Output<String> getMinTlsVersion() {
        return this.minTlsVersion == null ? Codegen.empty() : this.minTlsVersion;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Profile specifies the set of SSL features that can be used by the
     * load balancer when negotiating SSL with clients. If using `CUSTOM`,
     * the set of SSL features to enable must be specified in the
     * `customFeatures` field.
     * See the [official documentation](https://cloud.google.com/compute/docs/load-balancing/ssl-policies#profilefeaturesupport)
     * for information on what cipher suites each profile provides. If
     * `CUSTOM` is used, the `custom_features` attribute **must be set**.
     * Default value is `COMPATIBLE`.
     * Possible values are `COMPATIBLE`, `MODERN`, `RESTRICTED`, and `CUSTOM`.
     * 
     */
    @Import(name="profile")
      private final @Nullable Output<String> profile;

    public Output<String> getProfile() {
        return this.profile == null ? Codegen.empty() : this.profile;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public SSLPolicyArgs(
        @Nullable Output<List<String>> customFeatures,
        @Nullable Output<String> description,
        @Nullable Output<String> minTlsVersion,
        @Nullable Output<String> name,
        @Nullable Output<String> profile,
        @Nullable Output<String> project) {
        this.customFeatures = customFeatures;
        this.description = description;
        this.minTlsVersion = minTlsVersion;
        this.name = name;
        this.profile = profile;
        this.project = project;
    }

    private SSLPolicyArgs() {
        this.customFeatures = Codegen.empty();
        this.description = Codegen.empty();
        this.minTlsVersion = Codegen.empty();
        this.name = Codegen.empty();
        this.profile = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSLPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> customFeatures;
        private @Nullable Output<String> description;
        private @Nullable Output<String> minTlsVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<String> profile;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(SSLPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFeatures = defaults.customFeatures;
    	      this.description = defaults.description;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.name = defaults.name;
    	      this.profile = defaults.profile;
    	      this.project = defaults.project;
        }

        public Builder customFeatures(@Nullable Output<List<String>> customFeatures) {
            this.customFeatures = customFeatures;
            return this;
        }
        public Builder customFeatures(@Nullable List<String> customFeatures) {
            this.customFeatures = Codegen.ofNullable(customFeatures);
            return this;
        }
        public Builder customFeatures(String... customFeatures) {
            return customFeatures(List.of(customFeatures));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder minTlsVersion(@Nullable Output<String> minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }
        public Builder minTlsVersion(@Nullable String minTlsVersion) {
            this.minTlsVersion = Codegen.ofNullable(minTlsVersion);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder profile(@Nullable Output<String> profile) {
            this.profile = profile;
            return this;
        }
        public Builder profile(@Nullable String profile) {
            this.profile = Codegen.ofNullable(profile);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public SSLPolicyArgs build() {
            return new SSLPolicyArgs(customFeatures, description, minTlsVersion, name, profile, project);
        }
    }
}
