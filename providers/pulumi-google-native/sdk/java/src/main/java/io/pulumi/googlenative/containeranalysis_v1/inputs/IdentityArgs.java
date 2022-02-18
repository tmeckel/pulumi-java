// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The unique identifier of the update.
 * 
 */
public final class IdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The revision number of the update.
     * 
     */
    @InputImport(name="revision")
    private final @Nullable Input<Integer> revision;

    public Input<Integer> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    /**
     * The revision independent identifier of the update.
     * 
     */
    @InputImport(name="updateId")
    private final @Nullable Input<String> updateId;

    public Input<String> getUpdateId() {
        return this.updateId == null ? Input.empty() : this.updateId;
    }

    public IdentityArgs(
        @Nullable Input<Integer> revision,
        @Nullable Input<String> updateId) {
        this.revision = revision;
        this.updateId = updateId;
    }

    private IdentityArgs() {
        this.revision = Input.empty();
        this.updateId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> revision;
        private @Nullable Input<String> updateId;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revision = defaults.revision;
    	      this.updateId = defaults.updateId;
        }

        public Builder setRevision(@Nullable Input<Integer> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable Integer revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }

        public Builder setUpdateId(@Nullable Input<String> updateId) {
            this.updateId = updateId;
            return this;
        }

        public Builder setUpdateId(@Nullable String updateId) {
            this.updateId = Input.ofNullable(updateId);
            return this;
        }

        public IdentityArgs build() {
            return new IdentityArgs(revision, updateId);
        }
    }
}
