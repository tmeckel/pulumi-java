// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for a scoring code asset.
 * 
 */
public final class CodeConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final CodeConfigurationResponse Empty = new CodeConfigurationResponse();

    /**
     * ARM resource ID of the code asset.
     * 
     */
    @Import(name="codeId")
    private @Nullable String codeId;

    /**
     * @return ARM resource ID of the code asset.
     * 
     */
    public Optional<String> codeId() {
        return Optional.ofNullable(this.codeId);
    }

    /**
     * The script to execute on startup. eg. &#34;score.py&#34;
     * 
     */
    @Import(name="scoringScript", required=true)
    private String scoringScript;

    /**
     * @return The script to execute on startup. eg. &#34;score.py&#34;
     * 
     */
    public String scoringScript() {
        return this.scoringScript;
    }

    private CodeConfigurationResponse() {}

    private CodeConfigurationResponse(CodeConfigurationResponse $) {
        this.codeId = $.codeId;
        this.scoringScript = $.scoringScript;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CodeConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CodeConfigurationResponse $;

        public Builder() {
            $ = new CodeConfigurationResponse();
        }

        public Builder(CodeConfigurationResponse defaults) {
            $ = new CodeConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param codeId ARM resource ID of the code asset.
         * 
         * @return builder
         * 
         */
        public Builder codeId(@Nullable String codeId) {
            $.codeId = codeId;
            return this;
        }

        /**
         * @param scoringScript The script to execute on startup. eg. &#34;score.py&#34;
         * 
         * @return builder
         * 
         */
        public Builder scoringScript(String scoringScript) {
            $.scoringScript = scoringScript;
            return this;
        }

        public CodeConfigurationResponse build() {
            $.scoringScript = Objects.requireNonNull($.scoringScript, "expected parameter 'scoringScript' to be non-null");
            return $;
        }
    }

}
