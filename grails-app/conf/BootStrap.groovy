import sample.remote.Book

class BootStrap {

    def init = { servletContext ->

        new Book(title: "Grails in Action",
                ISBN: '1933988932',
                releaseDate: new Date(108, 5, 28),
                summary: '''Grails in Action is a comprehensive look at Grails for Java developers. It covers the nuts
                                and bolts of the core Grails components and is jam-packed with tutorials, techniques,
                                and insights from the trenches.''')
                .save(failOnError: true)

        new Book(title: "Grails: A Quick-Start Guide",
                ISBN: '1934356468',
                releaseDate: new Date(109, 10, 7),
                summary: '''Grails is a full stack web development framework that enables you to build complete web
                                applications in a fraction of the time and with less code than other frameworks..''')
                .save(failOnError: true)
    }
    def destroy = {
    }
}
