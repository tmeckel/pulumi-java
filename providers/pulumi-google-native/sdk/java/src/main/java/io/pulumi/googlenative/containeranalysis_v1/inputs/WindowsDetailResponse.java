// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.KnowledgeBaseResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WindowsDetailResponse extends io.pulumi.resources.InvokeArgs {

    public static final WindowsDetailResponse Empty = new WindowsDetailResponse();

    /**
     * The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
     */
    @InputImport(name="cpeUri", required=true)
    private final String cpeUri;

    public String getCpeUri() {
        return this.cpeUri;
    }

    /**
     * The description of this vulnerability.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The names of the KBs which have hotfixes to mitigate this vulnerability. Note that there may be multiple hotfixes (and thus multiple KBs) that mitigate a given vulnerability. Currently any listed KBs presence is considered a fix.
     * 
     */
    @InputImport(name="fixingKbs", required=true)
    private final List<KnowledgeBaseResponse> fixingKbs;

    public List<KnowledgeBaseResponse> getFixingKbs() {
        return this.fixingKbs;
    }

    /**
     * The name of this vulnerability.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public WindowsDetailResponse(
        String cpeUri,
        String description,
        List<KnowledgeBaseResponse> fixingKbs,
        String name) {
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.fixingKbs = Objects.requireNonNull(fixingKbs, "expected parameter 'fixingKbs' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private WindowsDetailResponse() {
        this.cpeUri = null;
        this.description = null;
        this.fixingKbs = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpeUri;
        private String description;
        private List<KnowledgeBaseResponse> fixingKbs;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixingKbs = defaults.fixingKbs;
    	      this.name = defaults.name;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFixingKbs(List<KnowledgeBaseResponse> fixingKbs) {
            this.fixingKbs = Objects.requireNonNull(fixingKbs);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public WindowsDetailResponse build() {
            return new WindowsDetailResponse(cpeUri, description, fixingKbs, name);
        }
    }
}
