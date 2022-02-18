// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.enums.AliasContextKind;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An alias to a repo revision.
 * 
 */
public final class AliasContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasContextArgs Empty = new AliasContextArgs();

    /**
     * The alias kind.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<AliasContextKind> kind;

    public Input<AliasContextKind> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The alias name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public AliasContextArgs(
        @Nullable Input<AliasContextKind> kind,
        @Nullable Input<String> name) {
        this.kind = kind;
        this.name = name;
    }

    private AliasContextArgs() {
        this.kind = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AliasContextKind> kind;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder setKind(@Nullable Input<AliasContextKind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable AliasContextKind kind) {
            this.kind = Input.ofNullable(kind);
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

        public AliasContextArgs build() {
            return new AliasContextArgs(kind, name);
        }
    }
}
