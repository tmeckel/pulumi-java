// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.KnowledgeBaseArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WindowsDetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsDetailArgs Empty = new WindowsDetailArgs();

    /**
     * The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar.
     * 
     */
    @Import(name="cpeUri", required=true)
      private final Output<String> cpeUri;

    public Output<String> getCpeUri() {
        return this.cpeUri;
    }

    /**
     * The description of the vulnerability.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed kb's presence is considered a fix.
     * 
     */
    @Import(name="fixingKbs", required=true)
      private final Output<List<KnowledgeBaseArgs>> fixingKbs;

    public Output<List<KnowledgeBaseArgs>> getFixingKbs() {
        return this.fixingKbs;
    }

    /**
     * The name of the vulnerability.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public WindowsDetailArgs(
        Output<String> cpeUri,
        @Nullable Output<String> description,
        Output<List<KnowledgeBaseArgs>> fixingKbs,
        Output<String> name) {
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.description = description;
        this.fixingKbs = Objects.requireNonNull(fixingKbs, "expected parameter 'fixingKbs' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WindowsDetailArgs() {
        this.cpeUri = Codegen.empty();
        this.description = Codegen.empty();
        this.fixingKbs = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cpeUri;
        private @Nullable Output<String> description;
        private Output<List<KnowledgeBaseArgs>> fixingKbs;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsDetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixingKbs = defaults.fixingKbs;
    	      this.name = defaults.name;
        }

        public Builder cpeUri(Output<String> cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }
        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Output.of(Objects.requireNonNull(cpeUri));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder fixingKbs(Output<List<KnowledgeBaseArgs>> fixingKbs) {
            this.fixingKbs = Objects.requireNonNull(fixingKbs);
            return this;
        }
        public Builder fixingKbs(List<KnowledgeBaseArgs> fixingKbs) {
            this.fixingKbs = Output.of(Objects.requireNonNull(fixingKbs));
            return this;
        }
        public Builder fixingKbs(KnowledgeBaseArgs... fixingKbs) {
            return fixingKbs(List.of(fixingKbs));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public WindowsDetailArgs build() {
            return new WindowsDetailArgs(cpeUri, description, fixingKbs, name);
        }
    }
}
