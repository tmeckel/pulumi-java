// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Library requirements for a Big Data pool powered by Apache Spark
 * 
 */
public final class LibraryRequirementsResponse extends com.pulumi.resources.InvokeArgs {

    public static final LibraryRequirementsResponse Empty = new LibraryRequirementsResponse();

    /**
     * The library requirements.
     * 
     */
    @Import(name="content")
    private @Nullable String content;

    /**
     * @return The library requirements.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The filename of the library requirements file.
     * 
     */
    @Import(name="filename")
    private @Nullable String filename;

    /**
     * @return The filename of the library requirements file.
     * 
     */
    public Optional<String> filename() {
        return Optional.ofNullable(this.filename);
    }

    /**
     * The last update time of the library requirements file.
     * 
     */
    @Import(name="time", required=true)
    private String time;

    /**
     * @return The last update time of the library requirements file.
     * 
     */
    public String time() {
        return this.time;
    }

    private LibraryRequirementsResponse() {}

    private LibraryRequirementsResponse(LibraryRequirementsResponse $) {
        this.content = $.content;
        this.filename = $.filename;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LibraryRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LibraryRequirementsResponse $;

        public Builder() {
            $ = new LibraryRequirementsResponse();
        }

        public Builder(LibraryRequirementsResponse defaults) {
            $ = new LibraryRequirementsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The library requirements.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable String content) {
            $.content = content;
            return this;
        }

        /**
         * @param filename The filename of the library requirements file.
         * 
         * @return builder
         * 
         */
        public Builder filename(@Nullable String filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param time The last update time of the library requirements file.
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            $.time = time;
            return this;
        }

        public LibraryRequirementsResponse build() {
            $.time = Objects.requireNonNull($.time, "expected parameter 'time' to be non-null");
            return $;
        }
    }

}
