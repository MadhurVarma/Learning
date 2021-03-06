import { useState } from 'react'
import { useHistory } from 'react-router-dom'
import { Card, Button, Form } from 'react-bootstrap'
import { addCourse } from '../../features/course/courseAPI'

export const AddCourse = () => {
  const history = useHistory();
 
// const [courseid, setCourseId] = useState();
 const [coursename, setCourseName] = useState('');
 const [coursedesc, setCourseDesc] = useState('');
 const [skillreqd, setSkillReqd] = useState('');
 //const [createdon, setCreatedOn] = useState(null);
 //const [lastupdatedon, setLastUpdatedon] = useState(null);
 const [createdon, setCreatedOn] = useState('2021-08-24T18:29:03.14700');
 const [lastupdatedon, setLastUpdatedon] = useState('2021-08-24T18:29:03.14700');


  // const handleInputCourseIdChange = (event) => {
  //   const updatedValue = event.target.value
  //   console.log( updatedValue )
  //   setCourseId( updatedValue )
    
  // }
  const handleInputCourseNameChange = (event) => {
    const updatedValue = event.target.value
    setCourseName( updatedValue )
  }

  const handleInputCourseDescChange = (event) => {
    const updatedValue = event.target.value
    setCourseDesc( updatedValue )
  }

  const handleInputSkillReqdChange = (event) => {
    const updatedValue = event.target.value
    setSkillReqd( updatedValue )
  }

  const handleSubmit = async (event) => {
    event.preventDefault()
    const course = {  
                      
                      // courseId          : courseid,
                      courseName        : coursename,
                      courseDesc        : coursedesc,
                      skillReqd         : skillreqd,
                      createdOn         : createdon,
                      lastUpdatedOn     : lastupdatedon
                     
                    };

    console.log(course);
    console.log('before try');

    try {
      console.log('inside try');
      await addCourse(course)
      console.log('after await');
      history.push('/course/all')
    } catch (error) {
      console.error(error)
    }

    history.push('/course/all')
  }

  const handleCancel = (e) => {
    history.push('/course/all')
   }

  return (
    <Card>
      <Card.Body>
        <Card.Title>Add Course</Card.Title>
        <Form onSubmit={handleSubmit}>
          <Form.Group className="mb-3" controlId="formCourseId">
            <Form.Label>Course Id</Form.Label>
            {/* <Form.Control value={courseid} type="text" placeholder="Enter Course Id" onChange={handleInputCourseIdChange} /> */}
            <Form.Control type="text" placeholder="Autogenerated Course Id"  readOnly />
          </Form.Group>
          <Form.Group className="mb-3" controlId="formCourseName">
             <Form.Label>Course Name</Form.Label>
            <Form.Control value={coursename} type="text" placeholder="Enter Course name" onChange={handleInputCourseNameChange} />
         </Form.Group>
         <Form.Group className="mb-3" controlId="formCo urseDescription">
            <Form.Label>Course Description</Form.Label>
            <Form.Control value={coursedesc} type="text" placeholder="Enter Course Description" onChange={handleInputCourseDescChange} />
        </Form.Group> 
        <Form.Group className="mb-3" controlId="formSkillReqd">
            <Form.Label>Skill Required</Form.Label>
            <Form.Control value={skillreqd} type="text" placeholder="Enter Skill Required" onChange={handleInputSkillReqdChange} />
        </Form.Group>
                          

        <Button variant="primary" style={{ marginRight: 15 }  } type="submit">
            Submit
          </Button>
          <Button variant="secondary"  onClick={handleCancel}>
            Cancel
          </Button>

        </Form>
      </Card.Body>
    </Card>
  )
}