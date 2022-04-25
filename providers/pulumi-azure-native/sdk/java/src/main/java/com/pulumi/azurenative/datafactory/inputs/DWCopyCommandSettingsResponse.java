// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DWCopyCommandDefaultValueResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DW Copy Command settings.
 * 
 */
public final class DWCopyCommandSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DWCopyCommandSettingsResponse Empty = new DWCopyCommandSettingsResponse();

    /**
     * Additional options directly passed to SQL DW in Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalOptions&#34;: { &#34;MAXERRORS&#34;: &#34;1000&#34;, &#34;DATEFORMAT&#34;: &#34;&#39;ymd&#39;&#34; }
     * 
     */
    @Import(name="additionalOptions")
    private @Nullable Map<String,String> additionalOptions;

    /**
     * @return Additional options directly passed to SQL DW in Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalOptions&#34;: { &#34;MAXERRORS&#34;: &#34;1000&#34;, &#34;DATEFORMAT&#34;: &#34;&#39;ymd&#39;&#34; }
     * 
     */
    public Optional<Map<String,String>> additionalOptions() {
        return Optional.ofNullable(this.additionalOptions);
    }

    /**
     * Specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    @Import(name="defaultValues")
    private @Nullable List<DWCopyCommandDefaultValueResponse> defaultValues;

    /**
     * @return Specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    public Optional<List<DWCopyCommandDefaultValueResponse>> defaultValues() {
        return Optional.ofNullable(this.defaultValues);
    }

    private DWCopyCommandSettingsResponse() {}

    private DWCopyCommandSettingsResponse(DWCopyCommandSettingsResponse $) {
        this.additionalOptions = $.additionalOptions;
        this.defaultValues = $.defaultValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DWCopyCommandSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DWCopyCommandSettingsResponse $;

        public Builder() {
            $ = new DWCopyCommandSettingsResponse();
        }

        public Builder(DWCopyCommandSettingsResponse defaults) {
            $ = new DWCopyCommandSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalOptions Additional options directly passed to SQL DW in Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: &#34;additionalOptions&#34;: { &#34;MAXERRORS&#34;: &#34;1000&#34;, &#34;DATEFORMAT&#34;: &#34;&#39;ymd&#39;&#34; }
         * 
         * @return builder
         * 
         */
        public Builder additionalOptions(@Nullable Map<String,String> additionalOptions) {
            $.additionalOptions = additionalOptions;
            return this;
        }

        /**
         * @param defaultValues Specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder defaultValues(@Nullable List<DWCopyCommandDefaultValueResponse> defaultValues) {
            $.defaultValues = defaultValues;
            return this;
        }

        /**
         * @param defaultValues Specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder defaultValues(DWCopyCommandDefaultValueResponse... defaultValues) {
            return defaultValues(List.of(defaultValues));
        }

        public DWCopyCommandSettingsResponse build() {
            return $;
        }
    }

}
