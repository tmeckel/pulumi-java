// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.GoogleDevtoolsContaineranalysisV1alpha1AliasContextKind;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An alias to a repo revision.
 * 
 */
public final class GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs();

    /**
     * The alias kind.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextKind> kind;

    public Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextKind> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The alias name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs(
        @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextKind> kind,
        @Nullable Output<String> name) {
        this.kind = kind;
        this.name = name;
    }

    private GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs() {
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextKind> kind;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder kind(@Nullable Output<GoogleDevtoolsContaineranalysisV1alpha1AliasContextKind> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable GoogleDevtoolsContaineranalysisV1alpha1AliasContextKind kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1AliasContextArgs(kind, name);
        }
    }
}
