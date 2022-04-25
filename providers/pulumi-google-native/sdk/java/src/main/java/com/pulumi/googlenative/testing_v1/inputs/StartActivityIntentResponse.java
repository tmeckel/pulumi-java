// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A starting intent specified by an action, uri, and categories.
 * 
 */
public final class StartActivityIntentResponse extends com.pulumi.resources.InvokeArgs {

    public static final StartActivityIntentResponse Empty = new StartActivityIntentResponse();

    /**
     * Action name. Required for START_ACTIVITY.
     * 
     */
    @Import(name="action", required=true)
    private String action;

    /**
     * @return Action name. Required for START_ACTIVITY.
     * 
     */
    public String action() {
        return this.action;
    }

    /**
     * Intent categories to set on the intent.
     * 
     */
    @Import(name="categories", required=true)
    private List<String> categories;

    /**
     * @return Intent categories to set on the intent.
     * 
     */
    public List<String> categories() {
        return this.categories;
    }

    /**
     * URI for the action.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    /**
     * @return URI for the action.
     * 
     */
    public String uri() {
        return this.uri;
    }

    private StartActivityIntentResponse() {}

    private StartActivityIntentResponse(StartActivityIntentResponse $) {
        this.action = $.action;
        this.categories = $.categories;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StartActivityIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StartActivityIntentResponse $;

        public Builder() {
            $ = new StartActivityIntentResponse();
        }

        public Builder(StartActivityIntentResponse defaults) {
            $ = new StartActivityIntentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action name. Required for START_ACTIVITY.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            $.action = action;
            return this;
        }

        /**
         * @param categories Intent categories to set on the intent.
         * 
         * @return builder
         * 
         */
        public Builder categories(List<String> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories Intent categories to set on the intent.
         * 
         * @return builder
         * 
         */
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param uri URI for the action.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public StartActivityIntentResponse build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.categories = Objects.requireNonNull($.categories, "expected parameter 'categories' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
