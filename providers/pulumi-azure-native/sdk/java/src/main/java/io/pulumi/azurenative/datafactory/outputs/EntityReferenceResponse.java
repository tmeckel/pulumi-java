// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EntityReferenceResponse {
    /**
     * The name of this referenced entity.
     * 
     */
    private final @Nullable String referenceName;
    /**
     * The type of this referenced entity.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private EntityReferenceResponse(
        @OutputCustomType.Parameter("referenceName") @Nullable String referenceName,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.referenceName = referenceName;
        this.type = type;
    }

    /**
     * The name of this referenced entity.
     * 
    */
    public Optional<String> getReferenceName() {
        return Optional.ofNullable(this.referenceName);
    }
    /**
     * The type of this referenced entity.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String referenceName;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder referenceName(@Nullable String referenceName) {
            this.referenceName = referenceName;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public EntityReferenceResponse build() {
            return new EntityReferenceResponse(referenceName, type);
        }
    }
}
