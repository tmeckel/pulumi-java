// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.enums.ComponentType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetComponentResult {
    /**
     * The Amazon Resource Name (ARN) of the component.
     * 
     */
    private final @Nullable String arn;
    /**
     * The encryption status of the component.
     * 
     */
    private final @Nullable Boolean encrypted;
    /**
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * 
     */
    private final @Nullable ComponentType type;

    @OutputCustomType.Constructor
    private GetComponentResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @OutputCustomType.Parameter("type") @Nullable ComponentType type) {
        this.arn = arn;
        this.encrypted = encrypted;
        this.type = type;
    }

    /**
     * The Amazon Resource Name (ARN) of the component.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The encryption status of the component.
     * 
    */
    public Optional<Boolean> getEncrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * 
    */
    public Optional<ComponentType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComponentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean encrypted;
        private @Nullable ComponentType type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.encrypted = defaults.encrypted;
    	      this.type = defaults.type;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder type(@Nullable ComponentType type) {
            this.type = type;
            return this;
        }
        public GetComponentResult build() {
            return new GetComponentResult(arn, encrypted, type);
        }
    }
}
