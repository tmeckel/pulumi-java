// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A note that indicates a type of analysis a provider would perform. This note exists in a provider&#39;s project. A `Discovery` occurrence is created in a consumer&#39;s project at the start of analysis. The occurrence&#39;s operation will indicate the status of the analysis. Absence of an occurrence linked to this note for a resource indicates that analysis hasn&#39;t started.
 * 
 */
public final class DiscoveryResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiscoveryResponse Empty = new DiscoveryResponse();

    /**
     * The kind of analysis that is handled by this discovery.
     * 
     */
    @Import(name="analysisKind", required=true)
    private String analysisKind;

    /**
     * @return The kind of analysis that is handled by this discovery.
     * 
     */
    public String analysisKind() {
        return this.analysisKind;
    }

    private DiscoveryResponse() {}

    private DiscoveryResponse(DiscoveryResponse $) {
        this.analysisKind = $.analysisKind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiscoveryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiscoveryResponse $;

        public Builder() {
            $ = new DiscoveryResponse();
        }

        public Builder(DiscoveryResponse defaults) {
            $ = new DiscoveryResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param analysisKind The kind of analysis that is handled by this discovery.
         * 
         * @return builder
         * 
         */
        public Builder analysisKind(String analysisKind) {
            $.analysisKind = analysisKind;
            return this;
        }

        public DiscoveryResponse build() {
            $.analysisKind = Objects.requireNonNull($.analysisKind, "expected parameter 'analysisKind' to be non-null");
            return $;
        }
    }

}
