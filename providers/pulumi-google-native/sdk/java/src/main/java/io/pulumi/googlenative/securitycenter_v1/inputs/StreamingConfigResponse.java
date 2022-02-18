// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The config for streaming-based notifications, which send each event as soon as it is detected.
 * 
 */
public final class StreamingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final StreamingConfigResponse Empty = new StreamingConfigResponse();

    /**
     * Expression that defines the filter to apply across create/update events of assets or findings as specified by the event type. The expression is a list of zero or more restrictions combined via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence than `AND`. Restrictions have the form ` ` and may have a `-` character in front of them to indicate negation. The fields map to those defined in the corresponding resource. The supported operators are: * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring matching, for strings. The supported value types are: * string literals in quotes. * integer literals without quotes. * boolean literals `true` and `false` without quotes.
     * 
     */
    @InputImport(name="filter", required=true)
    private final String filter;

    public String getFilter() {
        return this.filter;
    }

    public StreamingConfigResponse(String filter) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
    }

    private StreamingConfigResponse() {
        this.filter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
        }

        public Builder setFilter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public StreamingConfigResponse build() {
            return new StreamingConfigResponse(filter);
        }
    }
}
