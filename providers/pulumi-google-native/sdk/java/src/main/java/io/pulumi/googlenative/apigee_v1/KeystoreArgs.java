// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeystoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeystoreArgs Empty = new KeystoreArgs();

    @InputImport(name="environmentId", required=true)
    private final Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * Resource ID for this keystore. Values must match the regular expression `[\w[:space:]-.]{1,255}`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
    private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    public KeystoreArgs(
        Input<String> environmentId,
        @Nullable Input<String> name,
        Input<String> organizationId) {
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private KeystoreArgs() {
        this.environmentId = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeystoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> environmentId;
        private @Nullable Input<String> name;
        private Input<String> organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeystoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder setEnvironmentId(Input<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder setEnvironmentId(String environmentId) {
            this.environmentId = Input.of(Objects.requireNonNull(environmentId));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public KeystoreArgs build() {
            return new KeystoreArgs(environmentId, name, organizationId);
        }
    }
}
