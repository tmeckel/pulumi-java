// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final IAMPolicyState Empty = new IAMPolicyState();

    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="folder")
      private final @Nullable Input<String> folder;

    public Input<String> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    @InputImport(name="policyData")
      private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    public IAMPolicyState(
        @Nullable Input<String> etag,
        @Nullable Input<String> folder,
        @Nullable Input<String> policyData) {
        this.etag = etag;
        this.folder = folder;
        this.policyData = policyData;
    }

    private IAMPolicyState() {
        this.etag = Input.empty();
        this.folder = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> etag;
        private @Nullable Input<String> folder;
        private @Nullable Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.folder = defaults.folder;
    	      this.policyData = defaults.policyData;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder folder(@Nullable Input<String> folder) {
            this.folder = folder;
            return this;
        }

        public Builder folder(@Nullable String folder) {
            this.folder = Input.ofNullable(folder);
            return this;
        }

        public Builder policyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder policyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
            return this;
        }
        public IAMPolicyState build() {
            return new IAMPolicyState(etag, folder, policyData);
        }
    }
}
